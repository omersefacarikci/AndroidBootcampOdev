package com.omersefacarikci.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.omersefacarikci.odev4.databinding.FragmentAnasayfaBinding

class anasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)
        binding.button3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.agecis)
        }
        binding.button4.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.xFragment)
        }
        return binding.root
    }



}