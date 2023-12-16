package X;

import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1bX  reason: invalid class name and case insensitive filesystem */
public class C26071bX extends AnonymousClass3ZG {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Boolean A08;
    public Boolean A09;
    public Boolean A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G;
    public Boolean A0H;
    public Boolean A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public Long A0Q;
    public Long A0R;
    public boolean A0S;
    public final C183538qC A0T;

    public synchronized void A04() {
        String A0Z = C18280x3.A0Z(C18270x1.A05(this.A0T), "wam_client_errors");
        this.A0S = true;
        if (A0Z != null) {
            try {
                JSONObject A1H = AnonymousClass0x9.A1H(A0Z);
                this.A0M = A01(A1H, 2);
                this.A0N = A01(A1H, 3);
                this.A00 = A00(A1H, 1);
                this.A0H = A00(A1H, 4);
                this.A0I = A00(A1H, 5);
                this.A0G = A00(A1H, 6);
                this.A0E = A00(A1H, 7);
                this.A04 = A00(A1H, 8);
                this.A09 = A00(A1H, 9);
                this.A0A = A00(A1H, 10);
                this.A07 = A00(A1H, 11);
                this.A0F = A00(A1H, 12);
                this.A0C = A00(A1H, 13);
                this.A08 = A00(A1H, 14);
                this.A03 = A00(A1H, 15);
                this.A02 = A00(A1H, 16);
                this.A05 = A00(A1H, 17);
                this.A01 = A00(A1H, 18);
                this.A06 = A00(A1H, 19);
                this.A0D = A00(A1H, 20);
                this.A0Q = A01(A1H, 22);
                this.A0R = A01(A1H, 23);
                this.A0O = A01(A1H, 24);
                this.A0P = A01(A1H, 25);
                this.A0J = A01(A1H, 26);
                this.A0L = A01(A1H, 27);
                this.A0K = A01(A1H, 28);
                this.A0B = A00(A1H, 29);
            } catch (JSONException e) {
                Log.e((Throwable) e);
            }
        }
        return;
    }

    public synchronized void A05() {
        String str;
        if (!this.A0S) {
            C626936e.A0D(false, "WamClientErrors/WamClientErrors should be initialized before persist");
            A04();
        }
        if (A06()) {
            boolean z = true;
            boolean A1W = AnonymousClass000.A1W(this.A0J) | AnonymousClass000.A1W(this.A0L);
            if (this.A0K == null) {
                z = false;
            }
            if (!A1W && !z) {
                str = null;
                C18270x1.A0j(C18300x5.A0A(this.A0T), "wam_client_errors", str);
            }
        }
        JSONObject A1G = AnonymousClass0x9.A1G();
        A03(this.A0M, A1G, 2);
        A03(this.A0N, A1G, 3);
        A02(this.A00, A1G, 1);
        A02(this.A0H, A1G, 4);
        A02(this.A0I, A1G, 5);
        A02(this.A0G, A1G, 6);
        A02(this.A0E, A1G, 7);
        A02(this.A04, A1G, 8);
        A02(this.A09, A1G, 9);
        A02(this.A0A, A1G, 10);
        A02(this.A07, A1G, 11);
        A02(this.A0F, A1G, 12);
        A02(this.A0C, A1G, 13);
        A02(this.A08, A1G, 14);
        A02(this.A03, A1G, 15);
        A02(this.A02, A1G, 16);
        A02(this.A05, A1G, 17);
        A02(this.A01, A1G, 18);
        A02(this.A06, A1G, 19);
        A02(this.A0D, A1G, 20);
        A03(this.A0Q, A1G, 22);
        A03(this.A0R, A1G, 23);
        A03(this.A0O, A1G, 24);
        A03(this.A0P, A1G, 25);
        A03(this.A0J, A1G, 26);
        A03(this.A0L, A1G, 27);
        A03(this.A0K, A1G, 28);
        A02(this.A0B, A1G, 29);
        str = A1G.toString();
        C18270x1.A0j(C18300x5.A0A(this.A0T), "wam_client_errors", str);
    }

    public final boolean A06() {
        return this.A0M == null && this.A0N == null && this.A00 == null && this.A0O == null && this.A0P == null && this.A0Q == null && this.A0R == null && this.A01 == null && this.A02 == null && this.A03 == null && this.A04 == null && this.A05 == null && this.A06 == null && this.A07 == null && this.A08 == null && this.A09 == null && this.A0A == null && this.A0B == null && this.A0C == null && this.A0D == null && this.A0E == null && this.A0F == null && this.A0G == null && this.A0H == null && this.A0I == null;
    }

    public synchronized void serialize(AnonymousClass4AD r3) {
        if (!this.A0S) {
            C626936e.A0D(false, "WamClientErrors/WamClientErrors should be initialized before serialization");
            A04();
        }
        C162457s7.A0J(r3, 0);
        r3.Blb(2, this.A0M);
        r3.Blb(3, this.A0N);
        r3.Blb(1, this.A00);
        r3.Blb(24, this.A0O);
        r3.Blb(25, this.A0P);
        r3.Blb(22, this.A0Q);
        r3.Blb(23, this.A0R);
        r3.Blb(18, this.A01);
        r3.Blb(16, this.A02);
        r3.Blb(15, this.A03);
        r3.Blb(8, this.A04);
        r3.Blb(17, this.A05);
        r3.Blb(19, this.A06);
        r3.Blb(11, this.A07);
        r3.Blb(14, this.A08);
        r3.Blb(9, this.A09);
        r3.Blb(10, this.A0A);
        r3.Blb(26, this.A0B);
        r3.Blb(13, this.A0C);
        r3.Blb(20, this.A0D);
        r3.Blb(7, this.A0E);
        r3.Blb(12, this.A0F);
        r3.Blb(6, this.A0G);
        r3.Blb(4, this.A0H);
        r3.Blb(5, this.A0I);
    }

    public static void A02(Boolean bool, JSONObject jSONObject, int i) {
        if (bool != null) {
            try {
                jSONObject.put(String.valueOf(i), bool.booleanValue());
            } catch (JSONException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public static void A03(Long l, JSONObject jSONObject, int i) {
        if (l != null) {
            try {
                jSONObject.put(String.valueOf(i), l.longValue());
            } catch (JSONException e) {
                Log.e((Throwable) e);
            }
        }
    }

    public C26071bX(C183538qC r1) {
        this();
        this.A0T = r1;
    }

    public static Boolean A00(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Boolean.valueOf(jSONObject.getBoolean(valueOf));
        } catch (JSONException e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public static Long A01(JSONObject jSONObject, int i) {
        String valueOf = String.valueOf(i);
        if (!jSONObject.has(valueOf)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(valueOf));
        } catch (JSONException e) {
            Log.e((Throwable) e);
            return null;
        }
    }

    public Map getFieldsMap() {
        LinkedHashMap A0r = C18320x8.A0r();
        A0r.put(27, (Object) null);
        AnonymousClass0x2.A1H((Object) null, A0r, 28);
        AnonymousClass0x2.A1H((Object) null, A0r, 29);
        A0r.put(C18270x1.A0H(C18270x1.A0G(C18270x1.A0I(C18270x1.A0O(C18270x1.A0J(AnonymousClass3ZG.A06(C18270x1.A0P(AnonymousClass3ZG.A0B(C18270x1.A0M(C18270x1.A0L(C18270x1.A0Q(C18270x1.A0N(AnonymousClass3ZG.A05(AnonymousClass0x2.A0P(C18270x1.A0K(AnonymousClass0x2.A0N(AnonymousClass0x2.A0O(AnonymousClass0x2.A0Q(AnonymousClass3ZG.A09(AnonymousClass3ZG.A08(C18290x4.A0f(AnonymousClass3ZG.A0A(C18270x1.A0D(C18270x1.A0F(C18270x1.A0E(30, (Object) null, A0r), this.A0M, A0r), this.A0N, A0r), this.A00, A0r), this.A0O, A0r), this.A0P, A0r), this.A0Q, A0r), this.A0R, A0r), this.A01, A0r), this.A02, A0r), this.A03, A0r), this.A04, A0r), this.A05, A0r), this.A06, A0r), this.A07, A0r), this.A08, A0r), this.A09, A0r), this.A0A, A0r), this.A0B, A0r), this.A0C, A0r), this.A0D, A0r), this.A0E, A0r), this.A0F, A0r), this.A0G, A0r), this.A0H, A0r), this.A0I);
        return A0r;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("WamWamClientErrors {");
        C57292tP.A00(A0o, "wamClientDroppedEventCount", this.A0M);
        C57292tP.A00(A0o, "wamClientDroppedEventSize", this.A0N);
        C57292tP.A00(A0o, "wamClientErrorFlags", this.A00);
        C57292tP.A00(A0o, "wamClientPrivateDroppedEventCount", this.A0O);
        C57292tP.A00(A0o, "wamClientPrivateDroppedEventSize", this.A0P);
        C57292tP.A00(A0o, "wamClientRealtimeDroppedEventCount", this.A0Q);
        C57292tP.A00(A0o, "wamClientRealtimeDroppedEventSize", this.A0R);
        C57292tP.A00(A0o, "wamErrorBadCurrentEventBufferChecksum", this.A01);
        C57292tP.A00(A0o, "wamErrorBadEventBuffer", this.A02);
        C57292tP.A00(A0o, "wamErrorBadFileHeader", this.A03);
        C57292tP.A00(A0o, "wamErrorBadFileSize", this.A04);
        C57292tP.A00(A0o, "wamErrorBadHeaderChecksum", this.A05);
        C57292tP.A00(A0o, "wamErrorBadRotatedEventBufferChecksum", this.A06);
        C57292tP.A00(A0o, "wamErrorCloseFile", this.A07);
        C57292tP.A00(A0o, "wamErrorCreateWamFile", this.A08);
        C57292tP.A00(A0o, "wamErrorFseekFile", this.A09);
        C57292tP.A00(A0o, "wamErrorOpenFile", this.A0A);
        C57292tP.A00(A0o, "wamErrorOpenPsUploadQueueFile", this.A0B);
        C57292tP.A00(A0o, "wamErrorOpenWamFile", this.A0C);
        C57292tP.A00(A0o, "wamErrorPersistence", this.A0D);
        C57292tP.A00(A0o, "wamErrorReadFile", this.A0E);
        C57292tP.A00(A0o, "wamErrorRemoveFile", this.A0F);
        C57292tP.A00(A0o, "wamErrorWriteEventBuffer", this.A0G);
        C57292tP.A00(A0o, "wamErrorWriteFile", this.A0H);
        return AnonymousClass3ZG.A0G(this.A0I, "wamErrorWriteHeader", A0o);
    }

    public C26071bX() {
        super(1144, AnonymousClass3ZG.DEFAULT_SAMPLING_RATE, 0, -1);
    }
}
