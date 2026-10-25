package id.ac.polbeng.rustitaayuni.navigationexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import android.widget.Button
class DetailCategoryFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(
            R.layout.fragment_detail_category,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataName = DetailCategoryFragmentArgs.fromBundle(
            requireArguments()
        ).name

        val dataStock = DetailCategoryFragmentArgs.fromBundle(
            requireArguments()
        ).stock

        val tvCategoryName =
            view.findViewById<TextView>(R.id.tv_category_name)

        val tvCategoryDescription =
            view.findViewById<TextView>(R.id.tv_category_description)
        val btnHome = view.findViewById<Button>(R.id.btn_home)

        btnHome.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_detailCategoryFragment_to_homeFragment
            )
        )
        tvCategoryName.text = dataName
        tvCategoryDescription.text = "Stock : $dataStock"
    }
}
