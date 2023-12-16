package X;

import android.content.SharedPreferences;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2sY  reason: invalid class name and case insensitive filesystem */
public abstract class C56782sY {
    public int A00;
    public int A01;
    public final C56492s4 A02;
    public final C54292oU A03;
    public final AnonymousClass33K A04;
    public final C55132pq A05;
    public final AnonymousClass4FS A06;
    public final Integer A07;
    public volatile boolean A08 = true;
    public volatile boolean A09 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.io.File A01(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            X.2oU r0 = r3.A03     // Catch:{ all -> 0x0028 }
            java.io.File r0 = X.C54292oU.A03(r0)     // Catch:{ all -> 0x0028 }
            java.io.File r2 = X.AnonymousClass002.A0A(r0, r4)     // Catch:{ all -> 0x0028 }
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            boolean r0 = r2.mkdirs()     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0026
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = "SimpleAssetDownloader/getAssetDir/Could not make directory "
            X.AnonymousClass000.A10(r2, r0, r1)     // Catch:{ all -> 0x0028 }
            X.C18280x3.A13(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)
            r0 = 0
            return r0
        L_0x0026:
            monitor-exit(r3)
            return r2
        L_0x0028:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56782sY.A01(java.lang.String):java.io.File");
    }

    public void A02(C85034Er r12, AnonymousClass486 r13, Object obj, String str, String str2, Map map) {
        C85034Er r3 = r12;
        if (!this.A09) {
            this.A09 = true;
            this.A08 = false;
            AnonymousClass0x7.A1B(new C33671tV(this.A02, r3, this, this.A04, this.A05, this.A07, obj, str, map), this.A06);
        } else if (r12 != null) {
            r12.BLr();
        }
    }

    public boolean A0B(InputStream inputStream, Object obj, Map map) {
        C23401Sx r7 = (C23401Sx) this;
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        byte[] A002 = AnonymousClass2A7.A00(inputStream);
        Charset charset = AnonymousClass79X.A05;
        String str2 = new String(A002, charset);
        r7.A06.A03(r7.A00, "psl_payload_size", (long) str2.length());
        AnonymousClass3CS r4 = r7.A05.A01;
        byte[] A1a = C18320x8.A1a(str2, charset);
        synchronized (r4) {
            if (r4.A07) {
                r4.A00.put(str, A1a);
                ((C72173dI) r4.A05.getValue()).execute(new C71403c3(r4, A1a, str, 5));
            } else {
                r4.A00(new C81473zw(r4, str, A1a));
            }
        }
        return true;
    }

    public boolean A03(File file) {
        if (file == null || file.list() == null || file.list().length == 0) {
            return true;
        }
        return false;
    }

    public String A04(Object obj) {
        if (this instanceof C23401Sx) {
            return C18280x3.A0Z(AnonymousClass0x2.A0F(((C23401Sx) this).A03), "extensions_psl_cache_etag");
        }
        return null;
    }

    public void A08(int i) {
    }

    public void A09(Object obj, String str) {
        SharedPreferences.Editor putString;
        if (this instanceof C23401Sx) {
            AnonymousClass33p r0 = ((C23401Sx) this).A03;
            if (str == null) {
                putString = C18300x5.A09(r0, "extensions_psl_cache_etag");
            } else {
                putString = C18270x1.A03(r0).putString("extensions_psl_cache_etag", str);
            }
            putString.apply();
        }
    }

    public boolean A0C(Object obj) {
        if (this instanceof C23401Sx) {
            return AnonymousClass000.A1W(AnonymousClass0x2.A0F(((C23401Sx) this).A03).getString("extensions_psl_cache_etag", (String) null));
        }
        return false;
    }

    public boolean A0D(String str, Map map, byte[] bArr) {
        int i;
        Map map2;
        if (this instanceof C23401Sx) {
            return ((C23401Sx) this).A0H(map, bArr, true);
        }
        C23391Sw r4 = (C23391Sw) this;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsLogger:CommerceBloksAssetDownloader - ");
        A0o.append(r4.A00);
        A0o.append(" received compressed stream size : ");
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        A0o.append(((float) i) / 1000.0f);
        C18260x0.A1J(A0o, "KB");
        try {
            URI uri = new URI(r4.A01);
            if (uri.getQuery() == null) {
                map2 = C72043d5.A00();
            } else {
                String query = uri.getQuery();
                C162457s7.A0D(query);
                List A022 = AnonymousClass2AB.A02(query, "&");
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = A022.iterator();
                while (it.hasNext()) {
                    List A0P = C175728Zm.A0P(AnonymousClass001.A0m(it), new String[]{"="}, 2);
                    if (A0P.size() == 2) {
                        if (!(A0P instanceof Collection) || !A0P.isEmpty()) {
                            Iterator it2 = A0P.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (C175738Zn.A0V(AnonymousClass001.A0m(it2))) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        A0s.add(A0P);
                    }
                }
                int A0I = AnonymousClass8UG.A0I(C73783g4.A0b(A0s, 10));
                if (A0I < 16) {
                    A0I = 16;
                }
                LinkedHashMap A0C = C18330xA.A0C(A0I);
                Iterator it3 = A0s.iterator();
                while (it3.hasNext()) {
                    List list = (List) it3.next();
                    A0C.put(list.get(0), list.get(1));
                }
                map2 = A0C;
            }
            return AnonymousClass9LN.A00(C18310x6.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, map2), bArr);
        } catch (Exception e) {
            Log.d("CommerceBloksAssetDownloader/verifySignature/ invalid payload signature", e);
            return false;
        }
    }

    public C56782sY(C56492s4 r2, C54292oU r3, AnonymousClass33K r4, C55132pq r5, AnonymousClass4FS r6, Integer num) {
        this.A03 = r3;
        this.A06 = r6;
        this.A02 = r2;
        this.A05 = r5;
        this.A04 = r4;
        this.A07 = num;
        this.A00 = 1;
        this.A01 = 1;
    }

    public void A05() {
    }

    public void A06() {
    }

    public void A07() {
    }

    public boolean A0A() {
        return false;
    }
}
