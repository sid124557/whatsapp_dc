package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4Ka  reason: invalid class name and case insensitive filesystem */
public class C86414Ka implements AnonymousClass4EN {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C86414Ka(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A03 = obj;
        this.A00 = obj4;
        this.A01 = obj2;
        this.A02 = obj3;
    }

    public final void A00() {
        C69263Wi.A07(((AnonymousClass2PB) this.A03).A01, this.A00, this.A01, 26);
    }

    public void AyP(AnonymousClass2SI r11) {
        C69263Wi r5;
        Runnable r4;
        switch (this.A04) {
            case 0:
                C162457s7.A0J(r11, 0);
                AnonymousClass2MU r2 = (AnonymousClass2MU) r11.A03.A00;
                if (r2 != null && !TextUtils.isEmpty(r2.A00)) {
                    String str = r2.A01;
                    if (!TextUtils.isEmpty(str)) {
                        ArrayList A0s = C18300x5.A0s(str);
                        A0s.add(r2.A00);
                        r5 = ((AnonymousClass2ZG) this.A03).A01;
                        if (r5 != null) {
                            r4 = new C172708Mj(this.A00, this.A02, A0s, 28);
                            break;
                        } else {
                            throw C18270x1.A0S("globalUI");
                        }
                    }
                }
                ((AnonymousClass2ZG) this.A03).A00((AnonymousClass49I) this.A01, this.A00);
                return;
            case 1:
                C162457s7.A0J(r11, 0);
                Object obj = r11.A03.A00;
                if (obj == null) {
                    ((C111145hc) this.A02).A04("FETCH_PHONE_NUMBER_NULL");
                    AnonymousClass356.A02("WfsNativeAuthManager/emptyNonceResultResponse");
                    ((C45802ab) this.A00).A00(AnonymousClass001.A0e("Please link and/or unpause accounts"));
                    return;
                }
                C48422es r3 = ((AnonymousClass2PZ) this.A03).A02;
                r3.A01.markerEnd(551497305, 467);
                r3.A00 = false;
                ((C111145hc) this.A02).A05("FETCH_PHONE_NUMBER_END");
                C108895dj r32 = new C108895dj(new C166557yt(AnonymousClass3QD.A00(), obj, "WaLinkedNonce"), 3);
                int i = 1;
                if (this.A01 == C142766xj.A04) {
                    i = 2;
                }
                C45802ab r22 = (C45802ab) this.A00;
                C51242jV r42 = new C51242jV(r32, i);
                int i2 = r22.A00;
                C617031x.A01(new AnonymousClass40A(r22.A01, r22, r22.A02, r42, r22.A03, i2), i2);
                return;
            case 2:
                C162457s7.A0J(r11, 0);
                C626936e.A0C(!C615631i.A02());
                if (r11.A00 != 0) {
                    C43312Rq r52 = (C43312Rq) this.A03;
                    AnonymousClass2Z7 r33 = r52.A04;
                    if (r33 != null) {
                        C48642fE r23 = r11.A04;
                        C162457s7.A0K(r23, "null cannot be cast to non-null type com.whatsapp.waffle.utils.graphql.WaffleGraphqlErrorProcessor");
                        C54662p5 r7 = (C54662p5) this.A02;
                        Object obj2 = this.A01;
                        Object obj3 = this.A00;
                        C70513ac r43 = new C70513ac(r52, obj2, r7, obj3, 21);
                        r33.A00(r7, new AnonymousClass4JE(obj3, 0), (C27111dI) r23, r43);
                        return;
                    }
                    throw C18270x1.A0S("waffleGraphqlErrorHandler");
                }
                AnonymousClass2X8 r1 = (AnonymousClass2X8) this.A00;
                AnonymousClass2z1 r34 = (AnonymousClass2z1) r11.A03.A00;
                if (r34 == null) {
                    Log.w("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onSuccess Empty response, clearing cache");
                    C18270x1.A0m(r1.A00.A00());
                    return;
                }
                Log.d("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onSuccess updating crosspost settings data in cache");
                C614430u r44 = r1.A00;
                synchronized (r44) {
                    SharedPreferences.Editor edit = r44.A00().edit();
                    C60492ye r53 = r34.A00;
                    boolean z = r53.A00;
                    SharedPreferences.Editor putBoolean = edit.putBoolean("auto_crossposting", z);
                    String str2 = r34.A01;
                    C18270x1.A0l(putBoolean.putString("crossposting_destination", str2).putString("crossposting_destination_fb", str2).putString("crossposting_destination_ig", r34.A02).putLong("last_cache_update_time", r44.A02.A0H()).putBoolean("fb_auto_crossposting", z), "ig_auto_crossposting", r53.A01);
                }
                return;
            default:
                C162457s7.A0J(r11, 0);
                C51112jI r0 = (C51112jI) r11.A03.A00;
                if (r0 != null) {
                    String str3 = r0.A00;
                    if (str3.length() != 0) {
                        List A12 = C18290x4.A12(str3);
                        r5 = ((AnonymousClass2PB) this.A03).A01;
                        r4 = new C70363aN(this.A00, this.A02, A12, 34);
                        break;
                    }
                }
                AnonymousClass356.A02("ExchangeTokenForNativeAuthBlobAction/Empty Response from query");
                A00();
                return;
        }
        r5.BkS(r4);
    }

    public void BQq(IOException iOException) {
        switch (this.A04) {
            case 0:
                ((AnonymousClass2ZG) this.A03).A00((AnonymousClass49I) this.A01, this.A00);
                return;
            case 1:
                C162457s7.A0J(iOException, 0);
                ((C111145hc) this.A02).A04("FETCH_PHONE_NUMBER_ERROR");
                ((C45802ab) this.A00).A00(iOException);
                return;
            case 2:
                Log.e("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onDeliveryFailure");
                return;
            default:
                AnonymousClass356.A02(AnonymousClass000.A0P(iOException, "ExchangeTokenForNativeAuthBlobAction/Delivery Fail with exception: ", C18270x1.A0X(iOException)));
                A00();
                return;
        }
    }

    public void BSB(Exception exc) {
        switch (this.A04) {
            case 0:
                ((AnonymousClass2ZG) this.A03).A00((AnonymousClass49I) this.A01, this.A00);
                return;
            case 1:
                C162457s7.A0J(exc, 0);
                ((C111145hc) this.A02).A04("FETCH_PHONE_NUMBER_END");
                ((C45802ab) this.A00).A00(exc);
                return;
            case 2:
                C18260x0.A0x("WaffleClientCacheImpl/fetchDataFromServerWithHandler:onFailure Error code: ", AnonymousClass001.A0o(), 1);
                return;
            default:
                AnonymousClass356.A02(AnonymousClass000.A0P(exc, "ExchangeTokenForNativeAuthBlobAction/Error with exception: ", C18270x1.A0X(exc)));
                A00();
                return;
        }
    }
}
