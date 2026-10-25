package id.ac.polbeng.rustitaayuni.navigationexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class CategoriFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(
            R.layout.fragment_categori,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnLifestyle =
            view.findViewById<Button>(R.id.btn_category_lifestyle)

        btnLifestyle.setOnClickListener { button ->

            val action =
                CategoriFragmentDirections
                    .actionCategoryFragmentToDetailCategoryFragment()
                    .setName("Lifestyle")
                    .setStock(7L)

            button.findNavController().navigate(action)
        }
    }
}
