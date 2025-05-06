package com.omersefacarikci.odev5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.omersefacarikci.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var currentNumber = ""
    private var total = 0
    private var operator: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Rakam butonları
        binding.button17.setOnClickListener { appendNumber("1") }
        binding.button16.setOnClickListener { appendNumber("2") }
        binding.button15.setOnClickListener { appendNumber("3") }
        binding.button13.setOnClickListener { appendNumber("4") }
        binding.button12.setOnClickListener { appendNumber("5") }
        binding.button14.setOnClickListener { appendNumber("6") }
        binding.button10.setOnClickListener { appendNumber("7") }
        binding.button9.setOnClickListener { appendNumber("8") }
        binding.button11.setOnClickListener { appendNumber("9") }
        binding.button19.setOnClickListener { appendNumber("0") }

        binding.toplama.setOnClickListener {
            setOperator("+")
        }

        binding.cikarma.setOnClickListener {
            setOperator("-")
        }

        binding.carpma.setOnClickListener {
            setOperator("*")
        }
        binding.bolme.setOnClickListener {
            setOperator("/")
        }
        binding.esittir.setOnClickListener {
            calculate()
        }

        binding.temizleme.setOnClickListener {
            total = 0
            currentNumber = ""
            operator = null
            binding.textView.text = ""
        }
    }

    private fun appendNumber(number: String) {
        currentNumber += number
        binding.textView.text = currentNumber
    }

    private fun setOperator(op: String) {
        if (currentNumber.isNotEmpty()) {
            total = currentNumber.toInt()
            currentNumber = ""
            operator = op
        }
    }

    private fun calculate() {
        if (currentNumber.isNotEmpty() && operator != null) {
            val number = currentNumber.toInt()
            when (operator) {
                "+" -> total += number
                "-" -> total -= number
                "*" -> total *= number
                "/" -> total /= number
            }
            binding.textView.text = total.toString()
            currentNumber = ""
            operator = null
        }
    }
}
