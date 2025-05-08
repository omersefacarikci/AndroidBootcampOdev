package com.omersefacarikci.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.omersefacarikci.odev4.databinding.FragmentBBinding
import com.omersefacarikci.odev4.databinding.FragmentXBinding
import com.omersefacarikci.odev4.databinding.FragmentYBinding

class yFragment : Fragment() {
    private lateinit var binding: FragmentYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentYBinding.inflate(inflater, container, false)
        binding.button6.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfagecis)
        }
        return binding.root
    }


}