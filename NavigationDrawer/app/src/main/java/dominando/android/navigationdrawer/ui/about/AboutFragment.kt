package dominando.android.navigationdrawer.ui.about


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import dominando.android.navigationdrawer.R
import mehdi.sakout.aboutpage.AboutPage
import mehdi.sakout.aboutpage.Element

/**
 * A simple [Fragment] subclass.
 */
class AboutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val descricao = "Nunc elementum neque eu tincidunt egestas. Etiam luctus enim ut quam dignissim, a rhoncus turpis dignissim. " +
                "Donec sed diam quis tellus finibus gravida non sit amet leo."

        val element = Element()
        element.title = "Versão 1.0"

        return AboutPage(activity).
            setImage(R.drawable.logo).
            setDescription(descricao).

            addGroup("Entre em contato").
            addEmail("atm@consultoria.com.br", "Envie um email").
            addWebsite("http://www.google.com.br", "Acesse nosso site").

            addGroup("Redes sociais").
            addFacebook("jamiltondamasceno", "Facebook").
            addInstagram("_lcrodrigues", "Instagram").
            addTwitter("leonardocrr_", "Twitter").
            addGitHub("lcrodrigues", "GitHub").

            addItem(element).

            create()
    }


}