package com.example.usupbekov_adilet_homework_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.usupbekov_adilet_homework_3_7.databinding.FragmentSecontBinding


class SecontFragment : Fragment() {
    private lateinit var binding: FragmentSecontBinding
    private lateinit var navArgs: SecontFragmentArgs

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_secont, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            navArgs = SecontFragmentArgs.fromBundle(it)
        }
binding.tvName.text = navArgs.Rm.name
        binding.tvLife.text=navArgs.Rm.life
        binding.imgCharacter.setImageResource(navArgs.Rm.picture)
    }
}