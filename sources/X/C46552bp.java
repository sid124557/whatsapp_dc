package X;

import java.net.HttpURLConnection;

/* renamed from: X.2bp  reason: invalid class name and case insensitive filesystem */
public class C46552bp {
    public final C54292oU A00;
    public final AnonymousClass1VX A01;
    public final AnonymousClass33K A02;
    public final C49912hI A03;
    public final C55132pq A04;

    public final AnonymousClass4GL A00(AnonymousClass33K r7, String str) {
        AnonymousClass4GL A012 = r7.A01(this.A04, str, (String) null);
        HttpURLConnection httpURLConnection = ((AnonymousClass3PZ) A012).A01;
        int responseCode = httpURLConnection.getResponseCode();
        StringBuilder A0o = AnonymousClass001.A0o();
        if (responseCode >= 400) {
            A0o.append("WallpaperDownloader/download/Error, code=");
            C18270x1.A1F(A0o, httpURLConnection.getResponseCode());
            return null;
        }
        A0o.append("WallpaperDownloader/download/Response code from server=");
        C18260x0.A1F(A0o, httpURLConnection.getResponseCode());
        return A012;
    }

    public C46552bp(C54292oU r1, AnonymousClass1VX r2, AnonymousClass33K r3, C49912hI r4, C55132pq r5) {
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }
}
