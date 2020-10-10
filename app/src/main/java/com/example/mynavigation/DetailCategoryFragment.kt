package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_detail_category.*


class DetailCategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_category, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //menerima data dengan safeargs
        val dataName = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).name
        val dataDesciption = DetailCategoryFragmentArgs.fromBundle(arguments as Bundle).stock

        //menerima data dengan bundle
//      val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)
//      val dataDescription = arguments?.getLong(CategoryFragment.EXTRA_STOCK)


        tv_category_name.setText(dataName)
        tv_category_description.setText("Stock : $dataDesciption")

        //untuk pindah dari satu fragment ke fragment lain
        btn_profile.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_detailCategoryFragment_to_homeFragment)
        )
    }
}