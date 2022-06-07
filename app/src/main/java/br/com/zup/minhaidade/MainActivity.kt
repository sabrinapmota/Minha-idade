package br.com.zup.minhaidade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.zup.minhaidade.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(
            layoutInflater
        )
        setContentView(binding.root)
        binding.btValidacao.setOnClickListener {
            val nome = binding.etUserName.text.toString()
            val idade = binding.etUserAge.text.toString().toInt()
            validarIdade(idade)

        }
    }

    private fun validarIdade(idade: Int) {
        if (idade < 18) {
            binding.tvMessage.text = "menor de idade!"
        } else {
            binding.tvMessage.text = "Maior de 18!"
        }
    }
}