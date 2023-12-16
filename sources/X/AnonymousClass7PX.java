package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7PX  reason: invalid class name */
public class AnonymousClass7PX {
    public int A00;
    public int A01;
    public String A02;
    public ArrayList A03;
    public final C56492s4 A04;
    public final AnonymousClass33K A05;
    public final File A06;
    public final List A07 = Arrays.asList(new String[]{"es-AR", "en-AU", "de-AT", "nl-BE", "fr-BE", "pt-BR", "en-CA", "fr-CA", "es-CL", "da-DK", "fi-FI", "fr-FR", "de-DE", "zh-HK", "en-IN", "en-ID", "en-IE", "it-IT", "ja-JP", "ko-KR", "en-MY", "es-MX", "nl-NL", "en-NZ", "no-NO", "zh-CN", "pl-PL", "pt-PT", "en-PH", "ru-RU", "ar-SA", "en-ZA", "es-ES", "sv-SE", "fr-CH", "de-CH", "zh-TW", "tr-TR", "en-GB", "en-US", "es-US"});

    public AnonymousClass7PX(C56492s4 r43, C54292oU r44, AnonymousClass33K r45, String str) {
        this.A04 = r43;
        this.A05 = r45;
        this.A02 = str;
        File A0A = AnonymousClass002.A0A(r44.A00.getCacheDir(), "Bing");
        this.A06 = A0A;
        A0A.mkdirs();
    }
}
