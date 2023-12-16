package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.3S7  reason: invalid class name */
public class AnonymousClass3S7 implements AnonymousClass66Y {
    public final C55952rB A00;
    public final C56372rs A01;
    public final C48212eX A02;
    public final C59562x7 A03;
    public volatile boolean A04 = false;

    public void BRF(int[] iArr, int i) {
        C55952rB r4 = this.A00;
        if (i == 430) {
            Log.e("PrivacyDisclosureDataManager/ondisclosurefetchingerror no eligible disclosure");
            Object obj = r4.A01;
            synchronized (obj) {
                if (r4.A0E && iArr.length > 0 && iArr[0] == r4.A0B) {
                    r4.A0E = false;
                    r4.A0B = 0;
                    obj.notify();
                }
            }
        } else if (i == 400 || i == 410) {
            Log.e("PrivacyDisclosureDataManager/ondisclosurefetchingerror fail dl or parse case");
            Object obj2 = r4.A00;
            synchronized (obj2) {
                if (r4.A0D && iArr.length > 0 && iArr[0] == r4.A0A) {
                    r4.A0D = false;
                    r4.A0A = 0;
                    obj2.notify();
                }
            }
        }
    }

    public AnonymousClass3S7(C55952rB r2, C56372rs r3, C48212eX r4, C59562x7 r5) {
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A00 = r2;
    }

    public void BEw(JSONObject jSONObject, int[] iArr) {
        int i;
        String string;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("results");
            int i2 = 0;
            while (true) {
                int[] iArr2 = iArr;
                int length = iArr2.length;
                if (i2 < length) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        i = jSONObject2.getInt("notice_id");
                        jSONObject2.toString();
                        int[] copyOf = Arrays.copyOf(iArr2, length);
                        Arrays.sort(copyOf);
                        int binarySearch = Arrays.binarySearch(copyOf, i);
                        if (binarySearch >= 0 && binarySearch < length && i == iArr[binarySearch] && (string = jSONObject2.getJSONObject("privacy-disclosure").getString("deeplink")) != null) {
                            this.A01.A06((Integer) null, string, jSONObject2.toString(), i, 1, -1, false);
                            C48212eX r6 = this.A02;
                            AnonymousClass5W0 r5 = AnonymousClass5W0.A06;
                            C162457s7.A0J(r5, 3);
                            r6.A01(r5, i, 1);
                            C55952rB r1 = this.A00;
                            r1.A08.A00(i, 1);
                            r1.A02(i, 100);
                            r6.A01(r5, i, 100);
                        }
                    } catch (JSONException e) {
                        this.A02.A00(i, C18290x4.A0a());
                        throw e;
                    } catch (JSONException e2) {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "pdfndisclosurehandler/handledisclosurecontent wrong json object for disclosure ", e2);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        } catch (JSONException e3) {
            C18260x0.A1Q(AnonymousClass001.A0o(), "pdfndisclosurehandler/handledisclosurecontent wrong json object for disclosure ", e3);
        }
    }

    public boolean BEx(List list, boolean z, boolean z2) {
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        if (!this.A04) {
            this.A04 = true;
            this.A01.A01 = this.A00;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C622234e r5 = (C622234e) it.next();
            int i = r5.A01;
            Integer valueOf = Integer.valueOf(i);
            A0s2.add(valueOf);
            C56372rs r8 = this.A01;
            r8.A04();
            AnonymousClass7PW r2 = (AnonymousClass7PW) r8.A05.get(valueOf);
            if (r2 == null) {
                if (!AnonymousClass0x7.A1U(C39392Bu.A00, r5.A00)) {
                    A0s.add(valueOf);
                }
                r8.A05(i, r5.A00, r5.A02, r5.A03, z2 ? 1 : 0);
            } else {
                int i2 = r2.A03;
                int i3 = r5.A03;
                if (i2 != i3) {
                    A0s.add(valueOf);
                }
                r8.A06(Integer.valueOf(i3), (String) null, (String) null, i, r5.A00, -1, true);
            }
        }
        C56372rs r6 = this.A01;
        ArrayList A0s3 = AnonymousClass001.A0s();
        ConcurrentHashMap concurrentHashMap = r6.A05;
        Iterator A11 = C18290x4.A11(concurrentHashMap);
        while (A11.hasNext()) {
            Object next = A11.next();
            AnonymousClass7PW r22 = (AnonymousClass7PW) concurrentHashMap.get(next);
            if ((r22 == null || r22.A00 != 1) && !A0s2.contains(next)) {
                A0s3.add(next);
            }
        }
        Iterator it2 = A0s3.iterator();
        while (it2.hasNext()) {
            Number number = (Number) it2.next();
            AnonymousClass7PW r0 = (AnonymousClass7PW) concurrentHashMap.get(number);
            if (r0 != null) {
                if (!AnonymousClass0x7.A1U(C39392Bu.A00, r0.A01)) {
                    int intValue = number.intValue();
                    r6.A04();
                    if (concurrentHashMap.get(number) != null) {
                        concurrentHashMap.remove(number);
                        C18270x1.A0g(r6.A02().edit(), String.valueOf(intValue));
                        C18260x0.A0w("privacydisclosurestore/removedisclosure disclosure has been removed! id: ", AnonymousClass001.A0o(), intValue);
                    }
                    C18270x1.A0i(r6.A01(), AnonymousClass000.A0Y("repeat_last_ts_", AnonymousClass001.A0o(), intValue), 0);
                    C18270x1.A0h(r6.A01(), AnonymousClass000.A0Y("repeat_last_index_", AnonymousClass001.A0o(), intValue), -1);
                    C55952rB r02 = r6.A01;
                    if (r02 != null) {
                        File A0A = AnonymousClass002.A0A(AnonymousClass002.A0A(C54292oU.A03(r02.A05.A00), "privacy_disclosure"), String.valueOf(intValue));
                        if (!A0A.exists()) {
                            Log.e("PrivacyDisclosureFileCache/getPrivacyDisclosureDir can not make directory");
                        } else {
                            C627536m.A0P(A0A);
                        }
                    }
                }
            }
        }
        if (z && A0s.size() > 0) {
            this.A03.A01(A0s, 1200000, false);
        }
        return true;
    }
}
