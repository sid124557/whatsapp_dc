package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;

/* renamed from: X.3H2  reason: invalid class name */
public class AnonymousClass3H2 implements AnonymousClass4FJ {
    public static final long[] A0A = {300000, 3600000, 7200000};
    public final C55682qk A00;
    public final C56972sr A01;
    public final C55872r3 A02;
    public final C42712Pf A03;
    public final AnonymousClass2NK A04;
    public final C56612sH A05;
    public final AnonymousClass33p A06;
    public final C29041iB A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass31C A09;

    public void A00() {
        long A002 = this.A02.A00();
        if (A002 != -1) {
            A02(A002, this.A05.A0H(), false);
            return;
        }
        Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList/fail to generate ts");
        A01(-1);
    }

    public void A01(int i) {
        long A0H = this.A05.A0H();
        C55872r3 r4 = this.A02;
        AnonymousClass33p r5 = r4.A02;
        C18270x1.A0i(C18270x1.A03(r5), "adv_key_index_list_last_failure_time", A0H);
        C18260x0.A0K(r5, "adv_key_index_list_require_update");
        int i2 = AnonymousClass0x2.A0F(r5).getInt("adv_key_index_list_update_retry_count", 0) + 1;
        C18260x0.A0L(r5, "adv_key_index_list_update_retry_count", i2);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("DeviceKeyIndexListUpdateHandler/onError code=");
        A0o.append(i);
        C18260x0.A0x("; retryCount=", A0o, i2);
        if (i2 > 5) {
            Log.e("DeviceKeyIndexListUpdateHandler/onError logout all devices");
            this.A00.A0A("adv-key-index-list-update", true, "key index list update fails for more than 5 times");
            r4.A03();
        }
    }

    public final boolean A03() {
        if (this.A08.A0O(C58422vE.A02, 477) == 0 || !(!this.A07.A0C().isEmpty()) || this.A01.A0Y()) {
            return false;
        }
        return true;
    }

    public /* synthetic */ void BQS(C48932fi r1) {
    }

    public /* synthetic */ void BQx(C48932fi r1) {
    }

    public /* synthetic */ void BR0(C48932fi r1) {
    }

    public /* synthetic */ void BR2(C48932fi r1) {
    }

    public /* synthetic */ void BR4(AnonymousClass33G r1) {
    }

    public AnonymousClass3H2(C55682qk r1, C56972sr r2, C55872r3 r3, C42712Pf r4, AnonymousClass2NK r5, C56612sH r6, AnonymousClass33p r7, C29041iB r8, AnonymousClass1VX r9, AnonymousClass31C r10) {
        this.A05 = r6;
        this.A08 = r9;
        this.A00 = r1;
        this.A01 = r2;
        this.A09 = r10;
        this.A06 = r7;
        this.A04 = r5;
        this.A07 = r8;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final void A02(long j, long j2, boolean z) {
        boolean z2 = z;
        C18260x0.A1D("DeviceKeyIndexListUpdateHandler/updateKeyIndexList isRetry=", AnonymousClass001.A0o(), z2);
        C55872r3 r3 = this.A02;
        AnonymousClass33p r2 = r3.A02;
        long j3 = j;
        try {
            C21451Bw A022 = r3.A02(r3.A01(AnonymousClass239.E2EE, C18310x6.A03(AnonymousClass0x2.A0F(r2), "adv_raw_id"), C18310x6.A03(AnonymousClass0x2.A0F(r2), "adv_current_key_index"), j3));
            if (A022 != null) {
                AnonymousClass3T0 r9 = new AnonymousClass3T0(this, this.A09, j3, j2, z2);
                AnonymousClass31C r10 = r9.A03;
                String A032 = r10.A03();
                AnonymousClass36K r32 = new AnonymousClass36K("key-index-list", A022.A0F(), new AnonymousClass39V[]{new AnonymousClass39V("ts", r9.A00)});
                AnonymousClass39V[] A1W = AnonymousClass0x9.A1W();
                AnonymousClass39V.A0E(A1W, 0);
                AnonymousClass39V.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A032, A1W, 1);
                AnonymousClass39V.A06("xmlns", "md", A1W);
                r10.A0D(r9, AnonymousClass36K.A0E(r32, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", A1W), A032, 268, 32000);
                return;
            }
        } catch (Exception e) {
            Log.e("CompanionDeviceAdvUtil/createADVSignedKeyIndexList ", e);
        }
        Log.e("DeviceKeyIndexListUpdateHandler/updateKeyIndexList fail to generate index list");
        A01(-1);
    }

    public void BR3(C129526aS r2) {
        if (!r2.isEmpty() && A03()) {
            A00();
        }
    }

    public /* synthetic */ void BR1(C129526aS r1, int i) {
    }
}
