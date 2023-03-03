package com.example.usupbekov_adilet_homework_3_7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.usupbekov_adilet_homework_3_7.databinding.FragmentFirsttBinding

class FirsttFragment : Fragment() {
    private lateinit var binding: FragmentFirsttBinding
    private lateinit var Rmlist:ArrayList<Rm>



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirsttBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()

        val adapter = RmAdapter(Rmlist, this::onItemClick)
        binding.recycleView.adapter = adapter
    }

    private fun loadData() {
        Rmlist = ArrayList<Rm>()
        Rmlist.apply {
            add(Rm(R.drawable.img_1, "Alive", "Ric Sanchez"))
            add(Rm(R.drawable.img_2, "Alive", "Morty Smith"))
            add(Rm(R.drawable.img, "Dead", "Albert Enshtein"))
            add(Rm(R.drawable.img_4, "Alive", "Jerri Smith"))
        }

    }
    private fun onItemClick(rm: Rm){
        findNavController().navigate(FirsttFragmentDirections.actionFirsttFragmentToSecontFragment(rm))
    }
}