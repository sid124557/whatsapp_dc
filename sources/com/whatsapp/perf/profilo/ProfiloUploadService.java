package com.whatsapp.perf.profilo;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass33p;
import X.AnonymousClass3FI;
import X.AnonymousClass3YV;
import X.AnonymousClass4FS;
import X.AnonymousClass4GJ;
import X.AnonymousClass4JV;
import X.AnonymousClass5V3;
import X.AnonymousClass7US;
import X.C005105f;
import X.C18260x0;
import X.C22031Ec;
import X.C22121Ep;
import X.C29441ip;
import X.C55132pq;
import X.C55682qk;
import X.C56492s4;
import X.C614230q;
import X.C64323Da;
import X.C64333Db;
import X.C86084It;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.io.File;

public class ProfiloUploadService extends C005105f implements AnonymousClass4GJ {
    public C55682qk A00;
    public C56492s4 A01;
    public C29441ip A02;
    public AnonymousClass33p A03;
    public C55132pq A04;
    public AnonymousClass3FI A05;
    public AnonymousClass4FS A06;
    public boolean A07;
    public final Object A08;
    public volatile AnonymousClass3YV A09;

    public void A08(Intent intent) {
        String str;
        int length;
        File A0A = AnonymousClass002.A0A(getCacheDir(), "profilo/upload");
        if (!A0A.exists()) {
            str = "ProfiloUpload/No profilo logs available.";
        } else {
            File[] listFiles = A0A.listFiles(new C86084It(2));
            if (listFiles == null || (length = listFiles.length) == 0) {
                str = "ProfiloUpload/no files found; exit";
            } else {
                Log.d("ProfiloUpload/Profilo file found");
                for (int i = 1; i < length; i++) {
                    listFiles[i].delete();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("ProfiloUpload/delete other old file: ");
                    C18260x0.A1J(A0o, listFiles[i].getPath());
                }
                File file = listFiles[0];
                if (this.A02.A08(true) != 1) {
                    Log.d("ProfiloUpload/no wifi connection; exit");
                } else {
                    try {
                        C18260x0.A1P(AnonymousClass001.A0o(), "ProfiloUpload/Attempting to upload file; traceFile=", file);
                        C614230q r6 = new C614230q(this.A01, new AnonymousClass4JV(file, 4, this), this.A04, "https://crashlogs.whatsapp.net/wa_profilo_data", this.A05.A00(), (String) null, 7, false, false, false);
                        r6.A08("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
                        r6.A08("from", this.A00.A06());
                        C614230q.A01(r6, file, AnonymousClass0x9.A0g(file), "file");
                        C22121Ep r0 = (C22121Ep) this.A00;
                        r6.A08("agent", r0.A0C.A03(r0.A07, AnonymousClass5V3.A00(), false));
                        r6.A08("build_id", String.valueOf(546598543));
                        r6.A08("device_id", this.A03.A0Y());
                        r6.A03((AnonymousClass7US) null);
                        return;
                    } catch (Exception | OutOfMemoryError e) {
                        Log.w("ProfiloUpload/Error Uploading file", e);
                    }
                }
                if (file != null) {
                    file.delete();
                    return;
                }
                return;
            }
        }
        Log.d(str);
    }

    public final Object generatedComponent() {
        if (this.A09 == null) {
            synchronized (this.A08) {
                if (this.A09 == null) {
                    this.A09 = new AnonymousClass3YV(this);
                }
            }
        }
        return this.A09.generatedComponent();
    }

    public void onCreate() {
        if (!this.A07) {
            this.A07 = true;
            C64333Db r1 = ((C22031Ec) ((C64323Da) generatedComponent())).A06;
            this.A05 = C64333Db.A8x(r1);
            this.A00 = C64333Db.A01(r1);
            this.A06 = C64333Db.A8y(r1);
            this.A01 = C64333Db.A07(r1);
            this.A04 = (C55132pq) r1.AU8.get();
            this.A02 = C64333Db.A24(r1);
            this.A03 = C64333Db.A2s(r1);
        }
        super.onCreate();
    }

    public ProfiloUploadService(int i) {
        this.A08 = AnonymousClass002.A0D();
        this.A07 = false;
    }

    public ProfiloUploadService() {
        this(0);
    }
}
