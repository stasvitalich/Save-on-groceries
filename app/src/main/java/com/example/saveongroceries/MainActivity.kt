package com.example.saveongroceries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.saveongroceries.databinding.ActivityMainBinding

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

            var result1: Double
            var result2: Double
            // Check if the price and weight values are not empty
            if (price1Text.isNotEmpty() && weight1Text.isNotEmpty()) {
                // Convert the values to Double and calculate the result
                val price1 = price1Text.toDouble()
                val weight1 = weight1Text.toDouble()
                val item1Price = price1 / weight1 * 100
                result1 = item1Price

                // Round the result to two decimal places
                val formattedResult1 = String.format("%.2f", item1Price)

                // Update the TextView with the rounded result
                binding.textViewTotal1.text = "Цена 1 продукта за 100 гр.: $formattedResult1 т."
            }



            if (price2Text.isNotEmpty() && weight2Text.isNotEmpty()){
                val price2 = price2Text.toDouble()
                val weight2 = weight2Text.toDouble()
                val item2Price = price2 / weight2 * 100
                result2 = item2Price

                val formattedResult2 = String.format("%.2f", item2Price)

                // Update the TextView with the unrounded result
                binding.textTotal2.text = "Цена 2 продукта за 100 гр.: $formattedResult2 т."
            }
        }
    }
}




