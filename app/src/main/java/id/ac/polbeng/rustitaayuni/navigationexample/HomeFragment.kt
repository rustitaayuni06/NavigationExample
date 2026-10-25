
package id.ac.polbeng.rustitaayuni.navigationexample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnCategory = view.findViewById<Button>(R.id.btn_category)
        val btnProfile = view.findViewById<Button>(R.id.btn_profile)

        btnCategory.setOnClickListener(
            Navigation.createNavigateOnClickListener(
                R.id.action_homeFragment_to_categoryFragment
            )
        )

        btnProfile.setOnClickListener { button ->
            button.findNavController().navigate(
                R.id.action_homeFragment_to_profileActivity
            )
        }
    }
}
