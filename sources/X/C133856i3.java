package X;

import android.text.TextUtils;
import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6i3  reason: invalid class name and case insensitive filesystem */
public class C133856i3 extends C160827oN {
    public final SparseArray A00 = AnonymousClass6CA.A0I();
    public final C156687h2 A01;
    public final Set A02 = AnonymousClass002.A0K();

    public Map A04(String str, String str2, String str3, String str4, int i) {
        Map A04 = super.A04(str, str2, str3, (String) null, i);
        A04.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, Integer.toString(i));
        return A04;
    }

    public synchronized void A0G(int i) {
        String str;
        if (C18300x5.A1X(this.A02, i)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("DoodleEmojiManager/ensureBundleLoaded/bundle ");
            A0o.append(i);
            str = AnonymousClass000.A0X(" exists", A0o);
        } else {
            C160627o1 A022 = A02();
            if (A022 == null) {
                str = "DoodleEmojiManager/ensureBundleLoaded/localIdHash is null";
            } else {
                A0H(i, A022.A03(i));
            }
        }
        Log.d(str);
    }

    public final synchronized void A0H(int i, String str) {
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                File A0F = A0F(str, i, false);
                if (!A0F.exists()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("DoodleEmojiManager/loadFilePaths subdirectory for bundle=");
                    A0o.append(i);
                    A0o.append(" hash=");
                    A0o.append(str);
                    C18260x0.A1K(A0o, " doesn't exist");
                } else {
                    String[] list = A0F.list();
                    if (list == null) {
                        C18260x0.A1O(AnonymousClass001.A0o(), "DoodleEmojiManager/loadFilePaths no files found in ", A0F);
                    } else {
                        String absolutePath = A0F.getAbsolutePath();
                        for (String str2 : list) {
                            int A0F2 = AnonymousClass6CA.A0F(str2.split("\\.")[0].split("e"), 1);
                            SparseArray sparseArray = this.A00;
                            if (C627536m.A08(str2).equals("obi")) {
                                C156687h2 r1 = this.A01;
                                Set set = r1.A00;
                                if (set == null) {
                                    set = AnonymousClass0x9.A15(Collections.emptyList());
                                    r1.A00 = set;
                                }
                                if (!C18300x5.A1X(set, A0F2)) {
                                    continue;
                                } else if (!r1.A01.A0X(2025)) {
                                    continue;
                                }
                            } else if (sparseArray.indexOfKey(A0F2) >= 0) {
                                continue;
                            }
                            sparseArray.put(A0F2, new File(absolutePath, str2));
                        }
                        this.A02.add(Integer.valueOf(i));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C133856i3(X.C55682qk r17, X.C56492s4 r18, X.C29441ip r19, X.C56612sH r20, X.C54292oU r21, X.C57162tC r22, X.AnonymousClass33p r23, X.C159047l0 r24, X.AnonymousClass1VX r25, X.AnonymousClass4FV r26, X.AnonymousClass33K r27, X.C49912hI r28, X.C55132pq r29, X.C156687h2 r30, X.AnonymousClass4FS r31) {
        /*
            r16 = this;
            r13 = r28
            r12 = r27
            r11 = r26
            r15 = r31
            r3 = r18
            r2 = r17
            r14 = r29
            r1 = r16
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            android.util.SparseArray r0 = X.AnonymousClass6CA.A0I()
            r1.A00 = r0
            java.util.HashSet r0 = X.AnonymousClass002.A0K()
            r1.A02 = r0
            r0 = r30
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133856i3.<init>(X.2qk, X.2s4, X.1ip, X.2sH, X.2oU, X.2tC, X.33p, X.7l0, X.1VX, X.4FV, X.33K, X.2hI, X.2pq, X.7h2, X.4FS):void");
    }

    public final File A0F(String str, int i, boolean z) {
        String str2;
        File filesDir = this.A08.A00.getFilesDir();
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("downloadable/doodle_emoji_");
        A0o.append(i);
        A0o.append("_");
        A0o.append(str);
        if (z) {
            str2 = "_temp";
        } else {
            str2 = "";
        }
        return C18270x1.A0A(filesDir, str2, A0o);
    }
}
