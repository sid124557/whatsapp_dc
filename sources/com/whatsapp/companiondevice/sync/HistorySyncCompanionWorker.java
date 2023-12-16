package com.whatsapp.companiondevice.sync;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0PW;
import X.AnonymousClass0QH;
import X.AnonymousClass0x9;
import X.AnonymousClass2NP;
import X.AnonymousClass301;
import X.AnonymousClass33T;
import X.AnonymousClass4FS;
import X.C01410Ap;
import X.C05610Ue;
import X.C107385bE;
import X.C130066bK;
import X.C18260x0;
import X.C18310x6;
import X.C188268yc;
import X.C28131fk;
import X.C389229y;
import X.C42792Pn;
import X.C58922w2;
import X.C60052xv;
import X.C60322yM;
import X.C626936e;
import X.C627536m;
import X.C633138t;
import X.C64333Db;
import X.C66553Lw;
import X.C69963Zi;
import X.C84134Bd;
import X.C85894Ia;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class HistorySyncCompanionWorker extends AnonymousClass0QH {
    public final C130066bK A00 = new C130066bK();
    public final C60322yM A01;
    public final AnonymousClass301 A02;
    public final C60052xv A03;
    public final AnonymousClass4FS A04;

    public C188268yc A08() {
        Context context = this.A00;
        String string = context.getString(R.string.f11nameremoved);
        C05610Ue A002 = C66553Lw.A00(context);
        A002.A0A(string);
        A002.A0C(string);
        A002.A03 = -1;
        AnonymousClass33T.A02(A002, R.drawable.notifybar);
        C130066bK r4 = new C130066bK();
        r4.A05(new AnonymousClass0PW(232614045, A002.A01(), C107385bE.A07() ? 1 : 0));
        return r4;
    }

    public C188268yc A09() {
        Log.i("HistorySyncCompanionWorker/ startWork");
        C69963Zi.A01(this.A04, this, 7);
        return this.A00;
    }

    /* JADX INFO: finally extract failed */
    public final void A0B() {
        long j;
        byte[] bArr;
        InflaterInputStream inflaterInputStream;
        C58922w2 A012 = this.A03.A01();
        Object obj = this.A01.A01.A00.get("loggableStanzaId");
        if (obj instanceof Long) {
            j = C18310x6.A0B(obj);
        } else {
            j = 0;
        }
        if (A012 == null) {
            this.A00.A05(new C01410Ap());
            return;
        }
        AnonymousClass2NP r5 = new AnonymousClass2NP(this, A012, j);
        AnonymousClass301 r4 = this.A02;
        byte[] bArr2 = A012.A09;
        if (bArr2 != null) {
            Log.d("HistorySyncChunkProcessor directly process inline payload.");
            int i = A012.A01;
            long j2 = A012.A03;
            int i2 = A012.A00;
            Log.d("HistorySyncChunkProcessor process data");
            Inflater inflater = new Inflater(false);
            try {
                inflaterInputStream = new InflaterInputStream(AnonymousClass0x9.A0d(bArr2), inflater);
                ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
                C627536m.A0I(inflaterInputStream, A0e);
                bArr = A0e.toByteArray();
                inflaterInputStream.close();
                inflater.end();
            } catch (IOException e) {
                try {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "HistorySyncUtils/inflateData fails e=", e);
                    inflater.end();
                    Log.e("HistorySyncUtils/inflateData error no result");
                    bArr = new byte[0];
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            C42792Pn r2 = new C42792Pn();
            r2.A02 = j2;
            r2.A01 = r4.A07.A0H();
            r2.A03 = (long) bArr.length;
            r4.A01(r5, r2, (File) null, bArr, i, i2);
            return;
        }
        String str = A012.A05;
        if (!TextUtils.isEmpty(str)) {
            Log.d("HistorySyncChunkProcessor file has already been downloaded.");
            r4.A02(r5, A012, AnonymousClass002.A0B(str));
            return;
        }
        Log.d("HistorySyncChunkProcessor process download file");
        C28131fk r8 = r4.A0Q;
        C633138t r10 = C633138t.A0L;
        String str2 = A012.A07;
        C626936e.A06(str2);
        String str3 = A012.A06;
        C626936e.A06(str3);
        String str4 = A012.A04;
        C626936e.A06(str4);
        byte[] bArr3 = A012.A0A;
        C626936e.A06(bArr3);
        byte[] bArr4 = bArr3;
        String str5 = str4;
        r8.A08(new C85894Ia(r4, r5, A012, 1), r10, (C84134Bd) null, (C84134Bd) null, (String) null, str2, str3, (String) null, str5, (String) null, bArr4, 4, 21, 11, 0, A012.A02);
        return;
        throw th;
    }

    public HistorySyncCompanionWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C64333Db A012 = C389229y.A01(context);
        this.A04 = A012.BsP();
        this.A01 = (C60322yM) A012.ATS.get();
        this.A02 = (AnonymousClass301) A012.AcK.A00.A60.get();
        this.A03 = (C60052xv) A012.AH4.get();
    }
}
