package com.omersefacarikci.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.omersefacarikci.odev4.databinding.FragmentBBinding
import com.omersefacarikci.odev4.databinding.FragmentXBinding

class xFragment : Fragment() {
    private lateinit var binding: FragmentXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentXBinding.inflate(inflater, container, false)
        binding.button5.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.ygecis)
        }
        return binding.root
    }


}