package com.omersefacarikci.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.omersefacarikci.odev4.databinding.FragmentABinding
import com.omersefacarikci.odev4.databinding.FragmentAnasayfaBinding

class aFragment : Fragment() {
    private lateinit var binding: FragmentABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.bgecis)
        }
        return binding.root
    }
}