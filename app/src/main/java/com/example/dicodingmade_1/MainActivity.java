package com.example.dicodingmade_1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Film> films;
    private ListView listView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lv_list);
        films = filmData();
        FilmAdapter adapter = new FilmAdapter(this,films);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listener);

    }

    AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent detailIntent = new Intent(MainActivity.this,DetailActivity.class) ;
            detailIntent.putExtra(DetailActivity.EXTRA_FILMS,films.get(position));
            startActivity(detailIntent);
        }
    };
    private static ArrayList<Film> filmData()
    {
        ArrayList<Film> dummyFilms = new ArrayList<>();
        Film film = new Film();
        film.setImage(R.drawable.poster_a_star);
        film.setTitle("A Star Is Born");
        film.setDate("31 Agustus 2018");
        film.setDescription("A Star Is Born adalah film drama musikal romantis Amerika Serikat tahun 2018 yang disutradarai oleh Bradley Cooper dan diproduseri oleh Bradley Cooper, Todd Phillips, Bill Gerber, Jon Peters dan Lynette Howell Taylor. Naskah film ini ditulis oleh Eric Roth, Bradley Cooper dan Will Fetters berdasarkan film A Star Is Born tahun 1937 karya William A. Wellman, Robert Carson, Dorothy Parker dan Alan Campbell. Film ini dibintangi oleh Bradley Cooper, Lady Gaga, Andrew Dice Clay, Dave Chappelle dan Sam Elliott.\n" +
                "\n" +
                "Film A Star Is Born ditayangkan secara perdana di Festival Film Venesia pada tanggal 31 Agustus 2018[4][5] dan dirilis di Amerika Serikat pada tanggal 5 Oktober 2018.[6] Film ini mendapatkan review positif dari para kritikus.");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_deadpool);
        film.setTitle("Deadpool");
        film.setDate("10 February 2016");
        film.setDescription("Deadpool adalah sebuah film pahlawan super Amerika yang berdasarkan pada karakter Marvel Comics dengan nama yang sama. Film tersebut merupakan instalmen kedelapan dalam serial film X-Men. Film tersebut disutradarai oleh Tim Miller, dengan sebuah permainan latar buatan Rhett Reese dan Paul Wernick, dan dibintangi oleh Ryan Reynolds, Morena Baccarin, Ed Skrein, T. J. Miller, Gina Carano, Brianna Hildebrand, Andre Tricoteux, dan Leslie Uggams.\n" +
                "\n" +
                "Pengembangan dimulai pada bulan Februari 2004 dengan New Line Cinema, namun pindah pada bulan Maret 2005 sampai 20th Century Fox yang membeli hak film tersebut. Pada bulan Mei 2009, setelah Reynolds memerankan karakter dalam X-Men Origins: Wolverine, dengan kekecewaan umum para penggemar, Fox meminjamkan film tersebut kepada para penulis, dan Miller dipekerjakan untuk debut sutradaranya pada bulan April 2011. Antusias untuk rekaman rekaman CGI yang bocor Oleh Miller pada bulan Juli 2014 menyebabkan Fox menyinari film tersebut pada bulan September. Pengecoran tambahan dimulai pada awal 2015, dan pengambilan gambar utama dimulai di Vancouver dari bulan Maret sampai Mei.");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_avengerinfinity);
        film.setTitle("Avenger Infinity War");
        film.setDate("25 April 2018");
        film.setDescription("Avengers: Infinity War adalah film superhero yang berasal dari Amerika Serikat tahun 2018 beranggotakan tim superhero Avengers yang diproduksi oleh Marvel Studios dan didistribusikan oleh Walt Disney Studios Motion Pictures. Film ini adalah sekuel dari The Avengers dan Avengers: Age of Ultron, serta merupakan film kesembilan belas dalam Marvel Cinematic Universe (MCU). Film ini disutradarai oleh Anthony dan Joe Russo, dengan naskah ditulis oleh Christopher Markus & Stephen McFeely, dan menampilkan para pemeran seperti Robert Downey Jr., Chris Hemsworth, Mark Ruffalo, Chris Evans, Scarlett Johansson, Benedict Cumberbatch, Don Cheadle, Tom Holland, Chadwick Boseman, Paul Bettany, Elizabeth Olsen, Anthony Mackie, Sebastian Stan, Danai Gurira, Letitia Wright, Dave Bautista, Zoe Saldana, Josh Brolin, dan Chris Pratt. Dalam Avengers: Infinity War, Avengers bekerjasama dengan Guardians of the Galaxy untuk melawan Thanos, yang sedang berusaha mengumpulkan Batu Infinity.");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_birdbox);
        film.setTitle("Bird Box");
        film.setDate("12 November 2018");
        film.setDescription("Bird Box adalah sebuah film produksi tahun 2018 yang berasal dari Amerika Serikat bergenre post-apocalyptic. Film ini disutradarai oleh Susanne Bier, naskah ditulis oleh Eric Heisserer, berdasarkan novel berjudul sama, karya novelis Josh Malerman yang terbit pada tahun 2014.\n" +
                "\n" +
                "Film ini menceritakan perjalanan seorang wanita, diperankan oleh Sandra Bullock, yang bersama dua orang anak tak bernama, yang dipanggil Boy dan Girl, terpaksa harus melewati hutan dan mengarungi sungai dengan memakai penutup mata, agar terhindar dari bahaya yang ditimbulkan oleh mahluk supernatural untuk bertahan hidup dan terhindar dari ancaman bunuh diri. Film ini juga dibintangi oleh Trevante Rhodes, Jacki Weaver, Rosa Salazar, Danielle Macdonald, Lil Rel Howery, Tom Hollander, BD Wong, Sarah Paulson, Machine Gun Kelly (credited as Colson Baker), dan John Malkovich.");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_bohemian);
        film.setTitle("Bohemian Rhapsody");
        film.setDate("27 Oktober 2018");
        film.setDescription("Bohemian Rhapsody adalah sebuah film biografi tahun 2018 tentang grup band rock Inggris, Queen. Film ini menceritakan tentang kehidupan penyanyi Freddie Mercury, yang berujung pada penampilan Queen pada konser Live Aid di Stadion Wembley pada tahun 1985. Bohemian Rhapsody disutradarai oleh Bryan Singer, skenario film ini ditulis oleh Anthony McCarten dan diproduseri oleh Graham King dan mantan manajer Queen Jim Beach. Film ini dibintangi oleh Rami Malek sebagai Mercury, dan didukung oleh para pemeran di antaranya seperti Lucy Boynton, Gwilym Lee, Ben Hardy, Joe Mazzello, Aidan Gillen, Allen Leech, Tom Hollander dan Mike Myers. Anggota grup band Queen, Brian May dan Roger Taylor bertindak sebagai konsultan kreatif dan musik pada film ini. Film ini diproduksi secara patungan oleh perusahaan Inggris dan Amerika di antaranya 20th Century Fox, New Regency, GK Films, dan Queen Films, dengan Fox juga bertindak sebagai sebagai distributornya.");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_venom);
        film.setTitle("Venom");
        film.setDate("5 Oktober 2018");
        film.setDescription("Venom adalah sebuah film pahlawan super Amerika mendatang berdasarkan karakter Marvel Comics dengan nama yang sama, diproduksi oleh Columbia Pictures bekerja sama dengan Marvel[5] dan didistribusikan oleh Sony Pictures Releasing. Film ini dimaksudkan untuk menjadi film pertama dalam Marvel Universe dari Sony, tambahan untuk Marvel Cinematic Universe (MCU).[a] Film ini disutradarai oleh Ruben Fleischer dengan skenario oleh Scott Rosenberg, Jeff Pinkner, dan Kelly Marcel, serta dibintangi oleh Tom Hardy sebagai Eddie Brock / Venom, di samping Michelle Williams, Riz Ahmed, Scott Haze, dan Reid Scott. Dalam Venom, jurnalis Brock ditempeli oleh suatu simbiot alien yang memberikannya kekuatan super.");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_bumblebee);
        film.setTitle("Bumble Bee");
        film.setDate("21 December 2018");
        film.setDescription("Bumblebee: The Movie (juga dikenal sebagai Transformers Universe: Bumblebee atau hanya Bumblebee) adalah film aksi fiksi ilmiah Amerika tahun 2018 yang akan datang yang disutradarai oleh Travis Knight dengan sebuah skenario oleh Christina Hodson. Ini adalah spin-off dalam serial film live-action Transformers, berdasarkan karakter Transformers dengan nama yang sama, dan berfungsi sebagai prekuel Transformers (2007). Bintang film Hailee Steinfeld, John Cena, Jorge Lendeborg Jr., Rachel Crow, dan Pamela Adlon. Fotografi utama film ini dimulai pada 31 Juli 2017, di Los Angeles dan San Francisco, California.\n" +
                "\n" +
                "Ini adalah film pertama dalam franchise yang tidak disutradarai oleh Michael Bay, meski ia tetap akan berperan sebagai produser. Rencananya akan dirilis pada 21 Desember 2018 oleh Paramount Pictures.");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_creed);
        film.setTitle("Creed II");
        film.setDate("21 November 2018");
        film.setDescription("Creed II is a 2018 American sports drama film directed by Steven Caple Jr., and written by Sylvester Stallone and Juel Taylor from a story by Sascha Penn and Cheo Hodari Coker. A sequel to Creed (2015) and the eighth installment in the Rocky film series, it stars Michael B. Jordan, Stallone, Tessa Thompson, Dolph Lundgren, Florian Munteanu, Wood Harris, and Phylicia Rashad. Creed writer-director Ryan Coogler serves as an executive producer on the film. The film follows a fight over 33 years in the making, as Adonis Creed meets a new adversary in the ring: Viktor Drago, son of Ivan Drago, the powerful athlete who killed Adonis' father Apollo Creed.");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_dragon);
        film.setTitle("How to Tran Your Dragon");
        film.setDate("26 Maret 2010");
        film.setDescription("How to Train Your Dragon adalah sebuah film fantasi laga animasi komputer 3D Amerika Serikat tahun 2010 yang diproduksi oleh DreamWorks Animation berdasarkan buku dengan judul yang sama. Pengisi suara dalam film ini antara lain:Jay Baruchel, Gerard Butler, Craig Ferguson, America Ferrera, Jonah Hill, T.J. Miller, Kristen Wiig, dan Christopher Mintz-Plasse. Film ini dinominasikan untuk kategori film animasi terbaik dan Lagu orisinil terbaik pada ajang Academy Awards ke-83.");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_preman);
        film.setTitle("Preman Pensiun");
        film.setDate("17 January 2019");
        film.setDescription("Preman Pensiun adalah film Indonesia tahun 2019 yang diadaptasi dari sebuah sinetron berjudul sama yang pernah tayang di stasiun televisi RCTI. Film ini disutradarai oleh Aris Nugraha yang juga sebagai penulis skenario dan akan diputar perdana pada 17 Januari 2019.[1]");
        dummyFilms.add(film);

        film = new Film();
        film.setImage(R.drawable.poster_spiderman);
        film.setTitle("Spider-Man: Into the Spider-Verse");
        film.setDate("14 December 2018");
        film.setDescription("Spider-Man: Into the Spider-Verse adalah film pahlawan super animasi komputer Amerika Serikat tahun 2018 yang diangkat dari tokoh Marvel Comics, Miles Morales / Spider-Man. Film ini diproduksi oleh Columbia Pictures dan Sony Pictures Animation bekerja sama dengan Marvel dan didistribusikan oleh Sony Pictures Releasing. Ini adalah film cerita animasi pertama dalam seri Spider-Man.[4][5] Film ini mengambil latar di multisemesta bersama bernama \"Spider-Verse\" yang memiliki banyak semesta alternatif.[a] Film ini disutradarai oleh Bob Persichetti, Peter Ramsey, dan Rodney Rothman. Naskahnya ditulis oleh Phil Lord dan Rothman. Film ini dibintangi Shameik Moore yang memerankan Morales, Jake Johnson, Hailee Steinfeld, Mahershala Ali, Brian Tyree Henry, Lily Tomlin, Luna Lauren Velez, John Mulaney, Kimiko Glenn, Nicolas Cage, dan Liev Schreiber. Di Spider-Man: Into the Spider-Verse, Miles Morales adalah satu dari beberapa Spider-Man yang bersatu untuk menyelamatkan New York City dari Kingpin.");
        dummyFilms.add(film);

         return dummyFilms;
    }
}
