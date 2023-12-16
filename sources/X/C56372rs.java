package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.2rs  reason: invalid class name and case insensitive filesystem */
public class C56372rs {
    public SharedPreferences A00;
    public C55952rB A01;
    public final C56612sH A02;
    public final C60152y5 A03;
    public final C61112zj A04;
    public final ConcurrentHashMap A05 = new ConcurrentHashMap(4);

    public final synchronized SharedPreferences.Editor A01() {
        return A02().edit();
    }

    public final synchronized SharedPreferences A02() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A03.A03("privacy_disclosure_store");
            this.A00 = sharedPreferences;
        }
        return sharedPreferences;
    }

    public final void A04() {
        ConcurrentHashMap concurrentHashMap = this.A05;
        if (concurrentHashMap.size() == 0) {
            synchronized (this) {
                Iterator A0q = AnonymousClass000.A0q(A02().getAll());
                while (A0q.hasNext()) {
                    Map.Entry A0w = AnonymousClass001.A0w(A0q);
                    String A0q2 = C18310x6.A0q(A0w);
                    if (!A0q2.startsWith("repeat_last_index_") && !A0q2.startsWith("repeat_last_ts_")) {
                        try {
                            Integer valueOf = Integer.valueOf(C18310x6.A0q(A0w));
                            try {
                                JSONObject A1H = AnonymousClass0x9.A1H(AnonymousClass0x9.A12(A0w));
                                int i = A1H.getInt(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                                int i2 = A1H.getInt("stage");
                                int optInt = A1H.optInt("version", 1);
                                long j = A1H.getLong("activatedTimeInSecond");
                                long j2 = A1H.getLong("acceptedTimeInSecond");
                                String string = A1H.getString("deepLink");
                                String string2 = A1H.getString("content");
                                int optInt2 = A1H.optInt("rolloutMode", 0);
                                if (i2 < -1 || i2 > 1000) {
                                    C18260x0.A1Q(AnonymousClass001.A0o(), "privacydisclosurestore/loadFromFile bad stage value for disclosure = ", valueOf);
                                    C18270x1.A0g(A01(), C18310x6.A0q(A0w));
                                } else {
                                    concurrentHashMap.put(valueOf, new AnonymousClass7PW(string, string2, i, i2, optInt, optInt2, j, j2));
                                }
                            } catch (JSONException e) {
                                C18260x0.A1O(AnonymousClass001.A0o(), "privacydisclosurestore/loadFromFile bad json ", e);
                                C18270x1.A0g(A01(), C18310x6.A0q(A0w));
                            } catch (NumberFormatException e2) {
                                C18260x0.A1O(AnonymousClass001.A0o(), "privacydisclosurestore/loadFromFile corrupted number ", e2);
                                C18270x1.A0g(A01(), C18310x6.A0q(A0w));
                            }
                        } catch (NumberFormatException unused) {
                            Log.e("privacydisclosurestore disclosure id key is corrupted");
                            C18270x1.A0g(A01(), C18310x6.A0q(A0w));
                        }
                    }
                }
            }
        }
    }

    public void A05(int i, int i2, int i3, int i4, int i5) {
        long j;
        C55952rB r2;
        A04();
        int i6 = i2;
        if (i2 == 0) {
            j = C56612sH.A00(this.A02);
        } else {
            j = -1;
        }
        if (A07(new AnonymousClass7PW("", "", i3, i6, i4, i5, j, -1), i) && (r2 = this.A01) != null) {
            synchronized (r2.A01) {
                if (r2.A0E && i == r2.A0B) {
                    r2.A0E = false;
                    r2.A0B = 0;
                    r2.A01.notify();
                }
            }
        }
    }

    public C56372rs(C56612sH r3, C60152y5 r4, C61112zj r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }

    public int A00(int i) {
        A04();
        AnonymousClass7PW r0 = (AnonymousClass7PW) C18290x4.A0j(this.A05, i);
        if (r0 != null) {
            return r0.A01;
        }
        throw AnonymousClass001.A0c("Disclosure is not eligible for current user");
    }

    public String A03(int i) {
        A04();
        AnonymousClass7PW r0 = (AnonymousClass7PW) C18290x4.A0j(this.A05, i);
        if (r0 != null) {
            return r0.A06;
        }
        Log.d("PrivacyDisclosureStore/getDisclosureById disclosureRecord is null");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        if (r10 == r1) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r1 != 0) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(java.lang.Integer r6, java.lang.String r7, java.lang.String r8, int r9, int r10, int r11, boolean r12) {
        /*
            r5 = this;
            r5.A04()
            java.util.concurrent.ConcurrentHashMap r0 = r5.A05
            java.lang.Object r2 = X.C18290x4.A0j(r0, r9)
            X.7PW r2 = (X.AnonymousClass7PW) r2
            if (r2 != 0) goto L_0x0018
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "privacydisclosurestore/updatedisclosure invalid disclosureId = "
            X.C18260x0.A0x(r0, r1, r9)
        L_0x0017:
            return
        L_0x0018:
            int r1 = r2.A01
            if (r12 != 0) goto L_0x004a
            java.util.List r0 = X.C39392Bu.A01
            boolean r0 = X.AnonymousClass0x7.A1U(r0, r1)
            if (r0 != 0) goto L_0x004f
            r0 = 1
            if (r10 != r0) goto L_0x004d
            if (r1 == 0) goto L_0x004a
        L_0x0029:
            if (r7 == 0) goto L_0x002d
            r2.A07 = r7
        L_0x002d:
            if (r8 == 0) goto L_0x0031
            r2.A06 = r8
        L_0x0031:
            if (r6 == 0) goto L_0x0039
            int r0 = r6.intValue()
            r2.A03 = r0
        L_0x0039:
            r0 = -1
            if (r11 == r0) goto L_0x003f
            r0 = 1
            r2.A00 = r0
        L_0x003f:
            r5.A07(r2, r9)
            X.2rB r2 = r5.A01
            if (r2 == 0) goto L_0x0017
            java.lang.Object r1 = r2.A00
            monitor-enter(r1)
            goto L_0x006a
        L_0x004a:
            r2.A01 = r10
            goto L_0x004f
        L_0x004d:
            if (r10 != r1) goto L_0x004a
        L_0x004f:
            r0 = 5
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r10 != r0) goto L_0x005e
            X.2sH r0 = r5.A02
            long r0 = r0.A0H()
            long r0 = r0 / r3
            r2.A04 = r0
            goto L_0x0029
        L_0x005e:
            if (r10 != 0) goto L_0x0029
            X.2sH r0 = r5.A02
            long r0 = r0.A0H()
            long r0 = r0 / r3
            r2.A05 = r0
            goto L_0x0029
        L_0x006a:
            boolean r0 = r2.A0D     // Catch:{ all -> 0x007e }
            if (r0 == 0) goto L_0x007c
            int r0 = r2.A0A     // Catch:{ all -> 0x007e }
            if (r9 != r0) goto L_0x007c
            r0 = 0
            r2.A0D = r0     // Catch:{ all -> 0x007e }
            r2.A0A = r0     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x007e }
            r0.notify()     // Catch:{ all -> 0x007e }
        L_0x007c:
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56372rs.A06(java.lang.Integer, java.lang.String, java.lang.String, int, int, int, boolean):void");
    }

    public boolean A07(AnonymousClass7PW r5, int i) {
        StringBuilder sb;
        String str;
        A04();
        AnonymousClass0x2.A1H(r5, this.A05, i);
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            A1G.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r5.A02);
            A1G.put("stage", r5.A01);
            A1G.put("version", r5.A03);
            A1G.put("rolloutMode", r5.A00);
            A1G.put("activatedTimeInSecond", r5.A05);
            A1G.put("acceptedTimeInSecond", r5.A04);
            A1G.put("deepLink", r5.A07);
            A1G.put("content", r5.A06);
            C18270x1.A0e(A01(), A1G, String.valueOf(i));
            return true;
        } catch (JSONException e) {
            e = e;
            sb = AnonymousClass001.A0o();
            str = "privacydisclosurestore/savedisclosure JEX ";
            C18260x0.A1Q(sb, str, e);
            return false;
        } catch (Exception e2) {
            e = e2;
            sb = AnonymousClass001.A0o();
            str = "privacydisclosurestore/savedisclosure exception:";
            C18260x0.A1Q(sb, str, e);
            return false;
        }
    }
}
