package com.example.saveongroceries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.saveongroceries.databinding.ActivityMainBinding
import kotlin.math.abs

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {


            // Get the price and weight values from the EditText views
            val price1Text = binding.textEditPrice1.text.toString()
            val weight1Text = binding.textEditWeight1.text.toString()

            val price2Text = binding.textEditPrice2.text.toString()
            val weight2Text = binding.textEditWeight2.text.toString()

            if (price1Text.isEmpty() || weight1Text.isEmpty()){
                binding.textViewTotal1.text = null
                binding.textViewTotal2.text = null
                binding.textRecomendation.text = null
            }

            if (price2Text.isEmpty() || weight2Text.isEmpty()){
                binding.textViewTotal3.text = null
                binding.textViewTotal4.text = null
                binding.textRecomendation.text = null
            }

            var result1: Double = 0.0
            var result2: Double = 0.0
            // Check if the price and weight values are not empty
            if (price1Text.isNotEmpty() && weight1Text.isNotEmpty()) {
                // Convert the values to Double and calculate the result
                val price1 = price1Text.toDouble()
                val weight1 = weight1Text.toDouble()
                val item1Price = price1 / weight1 * 1000
                result1 = item1Price
                val itemPriceInRub = item1Price / 5.93

                // Round the result to two decimal places
                val formattedResult1 = String.format("%.2f", item1Price)
                val formattedResultRub = String.format("%.2f", itemPriceInRub)

                // Update the TextView with the rounded result
                binding.textViewTotal1.text = formattedResult1
                binding.textViewTotal2.text = formattedResultRub
            }



            if (price2Text.isNotEmpty() && weight2Text.isNotEmpty()){
                val price2 = price2Text.toDouble()
                val weight2 = weight2Text.toDouble()
                val item2Price = price2 / weight2 * 1000
                result2 = item2Price
                val itemPriceInRub2 = item2Price / 5.93

                val formattedResult2 = String.format("%.2f", item2Price)
                val formattedResult2Rub = String.format("%.2f", itemPriceInRub2)
                binding.textViewTotal3.text = formattedResult2
                binding.textViewTotal4.text = formattedResult2Rub

                // Update the TextView with the unrounded result
            }

            if (price1Text.isNotEmpty() && weight1Text.isNotEmpty() && price2Text.isNotEmpty() && weight2Text.isNotEmpty()) {
                var difference = 0.0

                if (result1 > result2){
                    difference = ((result1 / result2) - 1) * 100
                } else{
                    difference = ((result2 / result1) -1) * 100
                }


                val formattedDifference = String.format("%.2f", difference)

                if (result1 > result2){
                    binding.textRecomendation.text = "Продукт 1 дороже на $formattedDifference%"
                }else if(result1 < result2){
                    binding.textRecomendation.text = "Продукт 2 дороже на $formattedDifference%"
                } else{
                    binding.textRecomendation.text = "Стоимость продуктов одинакова"
                }


            }

        }
    }
}




