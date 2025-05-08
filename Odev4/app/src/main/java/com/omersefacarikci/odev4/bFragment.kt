package com.omersefacarikci.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.omersefacarikci.odev4.databinding.FragmentABinding
import com.omersefacarikci.odev4.databinding.FragmentBBinding

class bFragment : Fragment() {
    private lateinit var binding: FragmentBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        binding.button2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.ytobgecis)
        }
        return binding.root
    }

}