package X;

import com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker;
import com.whatsapp.jobqueue.job.SendMediaErrorReceiptJob;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2yM  reason: invalid class name and case insensitive filesystem */
public class C60322yM {
    public final C56972sr A00;
    public final C49712gy A01;
    public final C50072ha A02;
    public final AnonymousClass2FR A03 = new AnonymousClass2FR();
    public final C65203Gp A04;
    public final C55262q4 A05;
    public final C56612sH A06;
    public final C54292oU A07;
    public final C56542sA A08;
    public final C60052xv A09;
    public final AnonymousClass33Y A0A;
    public final AnonymousClass4FS A0B;
    public final C34171uL A0C;

    public void A01(AnonymousClass1nO r9) {
        long j;
        if (this.A09.A01() != null) {
            if (r9 != null) {
                j = r9.A1O;
            } else {
                j = 0;
            }
            C06310Xb A012 = C72333dY.A01(this.A0C);
            C02320Fs r6 = C02320Fs.KEEP;
            AnonymousClass0Aw r5 = new AnonymousClass0Aw(HistorySyncCompanionWorker.class);
            r5.A05(AnonymousClass0FO.RUN_AS_NON_EXPEDITED_WORK_REQUEST);
            AnonymousClass0Q9 r2 = new AnonymousClass0Q9();
            AnonymousClass0x2.A1K("loggableStanzaId", r2.A00, j);
            C18320x8.A1A(r2, r5);
            A012.A07(r6, AnonymousClass0x9.A0I(r5), "com.whatsapp.sync.historySyncCompanion");
        } else if (r9 != null) {
            this.A0A.A04(r9);
        }
    }

    public C60322yM(C56972sr r2, C49712gy r3, C50072ha r4, C65203Gp r5, C55262q4 r6, C56612sH r7, C54292oU r8, C56542sA r9, C60052xv r10, AnonymousClass33Y r11, AnonymousClass4FS r12, C34171uL r13) {
        this.A06 = r7;
        this.A00 = r2;
        this.A07 = r8;
        this.A0B = r12;
        this.A08 = r9;
        this.A04 = r5;
        this.A01 = r3;
        this.A0A = r11;
        this.A0C = r13;
        this.A02 = r4;
        this.A09 = r10;
        this.A05 = r6;
    }

    public static final JSONObject A00(int i, int i2) {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put("sync_type", i);
            A1G.put("chunk_order", i2);
            return A1G;
        } catch (JSONException unused) {
            Log.e("ReceiveHistorySyncManager/ Could not update history sync companion state");
            return null;
        }
    }

    public void A02(C58922w2 r11, long j, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ReceiveHistorySyncManager/ failed to process syncType=");
        int i = r11.A01;
        A0o.append(i);
        A0o.append(" chunkOrder=");
        int i2 = r11.A00;
        C18270x1.A1F(A0o, i2);
        if (z) {
            AnonymousClass1nO r5 = new AnonymousClass1nO(AnonymousClass2z0.A04(C56972sr.A04(this.A00), r11.A08), 1);
            if (j > 0) {
                r5.A1O = j;
            }
            byte[] bArr = r11.A0A;
            if (bArr != null) {
                r5.A0J = bArr;
            }
            byte[] bArr2 = r5.A0J;
            if (bArr2 == null) {
                Log.e("ReceiveHistorySyncManager/ missing media key");
            } else {
                this.A01.A02(new SendMediaErrorReceiptJob((C95814uZ) null, r5, "peer", bArr2));
            }
        } else {
            C18270x1.A0f(C55262q4.A00(this.A05), "HAS_COMPANION_HISTORY_SYNC_FAILED");
            AnonymousClass2FR r2 = this.A03;
            synchronized (r2) {
                AnonymousClass2K3 r0 = r2.A00;
                if (r0 != null) {
                    r0.A00.A05(Boolean.FALSE);
                }
            }
        }
        C50072ha r9 = this.A02;
        long j2 = r11.A02;
        long j3 = r11.A03;
        C25701aw r8 = new C25701aw();
        r8.A02 = C18280x3.A0S();
        r8.A0A = r9.A00();
        r8.A00 = C64663Ek.A01(i);
        r8.A01 = C64663Ek.A00(i);
        long A0H = r9.A03.A0H();
        r8.A09 = Long.valueOf(A0H);
        r8.A06 = C18310x6.A0f(A0H, j3);
        r8.A05 = Long.valueOf(j2);
        C61072zf r1 = r9.A04;
        long A052 = r1.A05();
        r8.A07 = Long.valueOf(A052);
        r8.A08 = C18310x6.A0f(A052, r1.A03());
        r8.A03 = AnonymousClass0x9.A0m(i2);
        r9.A06.BhD(r8);
        this.A09.A02(r11.A08);
    }
}
