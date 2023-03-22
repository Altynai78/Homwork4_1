package com.example.homwork4_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController

class TaskFragment : Fragment() {
    private lateinit var binding:FragmentTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentTaskBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSave.setOnClickListener{
            val data=Task(title=binding.etTitle.text.toString(),desc=binding.etDesc.text.toString())
            setFragmentResult(TASK_REQUEST, bundleOf("task_key" to data))

            findNavController().navigateUp()
        }
    }
    companion object{
        const val TASK_REQUEST = "task"
        const val TASK_KEY = "task_key"
    }
}