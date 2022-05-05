package kg.geektech.kotlin4.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import kg.geektech.kotlin4.PagerViewModel
import kg.geektech.kotlin4.adapter.RecyclerAdapter
import kg.geektech.kotlin4.databinding.Fragment3Binding

class Fragment3 : Fragment() {

    private lateinit var viewModel: PagerViewModel
    private lateinit var binding: Fragment3Binding
    private var list = arrayListOf<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[PagerViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment3Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.list.observe(viewLifecycleOwner){
            list = it as ArrayList<Int>
            binding.recHistory.layoutManager = LinearLayoutManager(requireContext())
            binding.recHistory.adapter = RecyclerAdapter(list)
        }
    }

}