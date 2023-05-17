package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.ceu_rosa_dallas),
        Affirmation(R.string.affirmation2, R.drawable.denali_1),
        Affirmation(R.string.affirmation3, R.drawable.fazenda_1),
        Affirmation(R.string.affirmation4, R.drawable.fazendas),
        Affirmation(R.string.affirmation5, R.drawable.frases_motivacionais_header),
        Affirmation(R.string.affirmation6, R.drawable.maldives_g03da4943c_1920_jpg),
        Affirmation(R.string.affirmation7, R.drawable.mensagens_incentivo_motivacao_profissional),
        Affirmation(R.string.affirmation8, R.drawable.ocean_1867285_1280),
        Affirmation(R.string.affirmation9, R.drawable.parque_estadual_dos_tr_s_picos_foto_gabriel_ribeiro_vallim_wikiparques),
        Affirmation(R.string.affirmation10, R.drawable.transferir)

        )
    }
}