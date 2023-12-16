package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4fe  reason: invalid class name and case insensitive filesystem */
public class C90014fe extends AnonymousClass1I8 {
    public final long A00;
    public final AnonymousClass0QU A01;
    public final C55682qk A02;
    public final String A03;
    public final Collection A04;

    public C90014fe(C55682qk r3, AnonymousClass4FS r4, String str, Collection collection, long j) {
        C18260x0.A1P(AnonymousClass001.A0o(), "mediafilefindjob/new; job=", this);
        this.A02 = r3;
        this.A03 = str;
        this.A04 = collection;
        this.A00 = j;
        this.A01 = AnonymousClass5CH.A00(r4, 10000);
    }

    public /* bridge */ /* synthetic */ Object A07() {
        C18260x0.A1P(AnonymousClass001.A0o(), "mediafilefindjob/run job=", this);
        AnonymousClass0QU r5 = this.A01;
        r5.A02();
        ArrayList A0s = AnonymousClass001.A0s();
        for (File listFiles : this.A04) {
            File[] listFiles2 = listFiles.listFiles();
            r5.A02();
            if (listFiles2 != null) {
                for (File file : listFiles2) {
                    if (file.isFile()) {
                        long abs = Math.abs(file.lastModified() - this.A00);
                        if (abs <= 3600000) {
                            A0s.add(new C148247Hq(file, abs));
                        }
                    }
                }
            }
        }
        r5.A02();
        C86614Ku.A1U(A0s, 44);
        StringBuilder A0o = AnonymousClass001.A0o();
        C18260x0.A19("mediafilefindjob/run/added ", A0o, A0s);
        C18260x0.A1P(A0o, " files; job=", this);
        r5.A02();
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("mediafilefindjob/run/analyzing/");
            File file2 = ((C148247Hq) it.next()).A01;
            A0o2.append(file2);
            C18260x0.A1P(A0o2, "; job=", this);
            r5.A02();
            try {
                if (this.A03.equals(C615131b.A00(this.A02, file2))) {
                    return file2;
                }
            } catch (IOException e) {
                Log.e("mediafilefindjob/run/ioexception", e);
            }
        }
        StringBuilder A0o3 = AnonymousClass001.A0o();
        A0o3.append("file not found for hash ");
        A0o3.append(this.A03);
        throw new FileNotFoundException(AnonymousClass000.A0P(this, "; job=", A0o3));
    }

    public void cancel() {
        C18260x0.A1P(AnonymousClass001.A0o(), "mediafilefindjob/cancel job=", this);
        super.cancel();
        this.A01.A01();
    }
}
