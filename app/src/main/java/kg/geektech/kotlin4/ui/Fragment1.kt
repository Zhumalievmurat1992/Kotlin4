package kg.geektech.kotlin4.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kg.geektech.kotlin4.PagerViewModel
import kg.geektech.kotlin4.databinding.Fragment1Binding

class Fragment1 : Fragment() {
    private lateinit var viewModel: PagerViewModel
    private lateinit var binding: Fragment1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[PagerViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnPlus.setOnClickListener {
            viewModel.incrementClick()
        }
        binding.btnMinus.setOnClickListener {
            viewModel.decrement()
        }
    }


}
