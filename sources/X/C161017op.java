package X;

import android.util.Log;

/* renamed from: X.7op  reason: invalid class name and case insensitive filesystem */
public final class C161017op {
    public static final String[] A00 = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static AnonymousClass81M A00(C161457ph r2, String str, int i, boolean z, boolean z2) {
        int i2;
        r2.A0I(4);
        if (r2.A03() == 1684108385) {
            i2 = C161457ph.A01(r2, 8);
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            String num = Integer.toString(i2);
            if (z) {
                return new C125876Jv(str, num);
            }
            return new C125886Jw(str, num);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failed to parse uint8 attribute: ");
        AnonymousClass6C7.A1N(A0o, C160197nC.A00(i));
        return null;
    }

    public static C125876Jv A01(C161457ph r4, String str, int i) {
        int A03 = r4.A03();
        if (r4.A03() == 1684108385 && A03 >= 22) {
            r4.A0I(10);
            int A06 = r4.A06();
            if (A06 > 0) {
                String A0Y = AnonymousClass000.A0Y("", AnonymousClass001.A0o(), A06);
                int A062 = r4.A06();
                if (A062 > 0) {
                    A0Y = AnonymousClass000.A0Y("/", AnonymousClass000.A0l(A0Y), A062);
                }
                return new C125876Jv(str, A0Y);
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failed to parse index/count attribute: ");
        AnonymousClass6C7.A1N(A0o, C160197nC.A00(i));
        return null;
    }

    public static C125876Jv A02(C161457ph r4, String str, int i) {
        int A03 = r4.A03();
        if (r4.A03() == 1684108385) {
            r4.A0I(8);
            return new C125876Jv(str, r4.A0C(A03 - 16));
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Failed to parse text attribute: ");
        AnonymousClass6C7.A1N(A0o, C160197nC.A00(i));
        return null;
    }
}
