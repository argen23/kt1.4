package com.example.kt14.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.kt14.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    private lateinit var binding : FragmentThirdBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var adapter : HistoryAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        adapter = HistoryAdapter()

        viewModel.commands.observe(viewLifecycleOwner){
            adapter.setList(it)
        }
        binding.rvTrd.adapter = adapter
    }

}