package com.kamiz.kamizapp.ui.login

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kamiz.kamizapp.R

class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    fun showError(error: String) {
        AlertDialog.Builder(requireContext())
            .setMessage(error)
            .setPositiveButton("ok") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }

    fun navigateToHomeFragment() {
//        TODO: Navigate to HomeFragment
        AlertDialog.Builder(requireContext())
            .setMessage("EEEEXITO!!!")
            .setPositiveButton("ok") { dialog, _ ->
                dialog.dismiss()
            }
            .create().show()
    }

}