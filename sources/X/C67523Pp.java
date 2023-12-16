package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.3Pp  reason: invalid class name and case insensitive filesystem */
public class C67523Pp implements AnonymousClass4F7 {
    public C71903cr A00;
    public boolean A01;
    public final C55682qk A02;
    public final AnonymousClass1R8 A03;
    public final C27821ej A04;
    public final C58632vZ A05;
    public final AnonymousClass1VX A06;

    public static final void A00(C56862sg r4) {
        String[] strArr = new String[1];
        C18280x3.A1Q(strArr, 1, 0);
        C18260x0.A0w("emojidictionarystore/clearall/count=", AnonymousClass001.A0o(), r4.A07("emoji_search_tag", "type=?", "EmojiDictionaryStore/clearAll/DELETE_EMOJI_SEARCH_TAG", strArr));
    }

    public /* bridge */ /* synthetic */ Collection B3C(String str, int i, boolean z, boolean z2) {
        return A01(str, i, false);
    }

    public void Ayq() {
        C69833Yo Axl;
        C85284Fq A0C = this.A03.A0C();
        try {
            Axl = A0C.Axl();
            A00(((AnonymousClass3H0) A0C).A03);
            Axl.A00();
            Axl.close();
            A0C.close();
            return;
        } catch (Throwable th) {
            try {
                A0C.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public Collection B3D(String[] strArr, int i, boolean z, boolean z2) {
        C626936e.A0D(false, "Not implemented");
        return AnonymousClass001.A0s();
    }

    public int getCount() {
        Cursor A0E;
        AnonymousClass4GK A0B = this.A03.get();
        try {
            int i = 0;
            A0E = ((AnonymousClass3H0) A0B).A03.A0E("SELECT count(*) as count FROM emoji_search_tag WHERE type=?", "GET_COUNT_EMOJI_SEARCH_TAG", new String[]{String.valueOf(1)});
            if (A0E.moveToNext()) {
                i = AnonymousClass0x2.A03(A0E);
            }
            A0E.close();
            A0B.close();
            return i;
        } catch (Throwable th) {
            try {
                A0B.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C67523Pp(C55682qk r3, C54292oU r4, C60972zT r5, C45932ao r6, C27821ej r7, C58632vZ r8, AnonymousClass1VX r9) {
        this.A06 = r9;
        this.A02 = r3;
        this.A04 = r7;
        this.A05 = r8;
        this.A03 = new AnonymousClass1R8(r4.A00, r3, r5, r6);
    }

    public List A01(String str, int i, boolean z) {
        ArrayList arrayList;
        ArrayList A0s = AnonymousClass001.A0s();
        for (int[] iArr : this.A04.A03()) {
            if (iArr != null) {
                A0s.add(new C106655Zv(iArr));
            }
        }
        C58632vZ r3 = this.A05;
        synchronized (r3) {
            List list = r3.A00;
            if (list != null) {
                arrayList = AnonymousClass002.A0J(list);
            } else {
                ArrayList A0s2 = AnonymousClass001.A0s();
                String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r3.A02), "top_emojis");
                if (A0Z != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(A0Z);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            A0s2.add(C106655Zv.A00(jSONArray.getString(i2)));
                        }
                        r3.A00 = A0s2;
                        arrayList = AnonymousClass002.A0J(A0s2);
                    } catch (JSONException e) {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "topemojisstore/get-top-emojis/failed ", e);
                        arrayList = AnonymousClass002.A0J(C58632vZ.A03);
                    }
                } else {
                    arrayList = AnonymousClass002.A0J(C58632vZ.A03);
                }
            }
        }
        return A02(str, A0s, arrayList, i, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A02(java.lang.String r19, java.util.List r20, java.util.List r21, int r22, boolean r23) {
        /*
            r18 = this;
            java.lang.String r0 = r19.trim()
            java.lang.String r8 = X.C107575bX.A07(r0)
            java.util.LinkedHashSet r1 = X.AnonymousClass0x9.A17()
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            if (r23 == 0) goto L_0x008c
            r12 = 1
            java.util.Set r0 = r7.A03(r8, r9, r10, r11, r12)
        L_0x001b:
            r1.addAll(r0)
        L_0x001e:
            X.1VX r3 = r7.A06
            r2 = 2880(0xb40, float:4.036E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r2)
            if (r0 != 0) goto L_0x0035
            X.3dY r0 = X.C155427er.A00
            java.lang.Object r0 = r0.get()
            java.util.Collection r0 = (java.util.Collection) r0
            r1.removeAll(r0)
        L_0x0035:
            java.util.ArrayList r5 = X.C18290x4.A0y(r1)
            java.util.Iterator r10 = r1.iterator()
        L_0x003d:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r6 = r10.next()
            X.5Zv r6 = (X.C106655Zv) r6
            int r0 = r5.size()
            if (r0 >= r11) goto L_0x00c0
            int[] r9 = r6.A00
            int r0 = r9.length
            r8 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0079
            r0 = 2
            int[] r1 = new int[r0]
            r0 = r9[r8]
            r1[r8] = r0
            r0 = 65039(0xfe0f, float:9.1139E-41)
            X.5Zv r7 = X.C18290x4.A0Q(r1, r0, r2)
            int[] r1 = r7.A00
            X.4qr r0 = new X.4qr
            r0.<init>(r1)
            long r3 = com.whatsapp.emoji.EmojiDescriptor.A00(r0, r2)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0079
            r5.add(r7)
            goto L_0x003d
        L_0x0079:
            X.4qr r0 = new X.4qr
            r0.<init>(r9)
            long r3 = com.whatsapp.emoji.EmojiDescriptor.A00(r0, r8)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003d
            r5.add(r6)
            goto L_0x003d
        L_0x008c:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0099
            r1.addAll(r9)
            r1.addAll(r10)
            goto L_0x001e
        L_0x0099:
            int r0 = r1.size()
            int r16 = r22 - r0
            r17 = 1
            r12 = r7
            r13 = r8
            r14 = r9
            r15 = r10
            java.util.Set r0 = r12.A03(r13, r14, r15, r16, r17)
            r1.addAll(r0)
            int r0 = r1.size()
            if (r0 >= r11) goto L_0x001e
            int r0 = r1.size()
            int r16 = r22 - r0
            r17 = 0
            java.util.Set r0 = r12.A03(r13, r14, r15, r16, r17)
            goto L_0x001b
        L_0x00c0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67523Pp.A02(java.lang.String, java.util.List, java.util.List, int, boolean):java.util.List");
    }

    public final Set A03(String str, List list, List list2, int i, boolean z) {
        C71903cr r1;
        String str2;
        String A0X;
        Cursor A0E;
        HashSet A0K = AnonymousClass002.A0K();
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        if (A17.size() < i) {
            if (!this.A01) {
                this.A02.A0A("emoji dictionary is not prepared yet", false, (String) null);
                return A17;
            }
            A0K = AnonymousClass002.A0K();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("SELECT DISTINCT symbol FROM emoji_search_tag WHERE type=? AND (");
            A0o.append("tag");
            if (z) {
                str2 = " = ";
            } else {
                str2 = " LIKE ";
            }
            A0o.append(str2);
            A0o.append("? OR ");
            A0o.append("symbol");
            A0o.append("=?)");
            String A0X2 = AnonymousClass000.A0X(" ORDER BY _id ASC LIMIT ?", A0o);
            String[] strArr = new String[4];
            C18280x3.A1Q(strArr, 1, 0);
            if (z) {
                A0X = str;
            } else {
                A0X = AnonymousClass000.A0X("%", AnonymousClass000.A0l(str));
            }
            C18300x5.A1K(A0X, str, strArr);
            C18280x3.A1Q(strArr, 256, 3);
            AnonymousClass0PJ A0G = AnonymousClass0x9.A0G(A0X2, strArr);
            try {
                AnonymousClass4GK A0B = this.A03.get();
                try {
                    A0E = ((AnonymousClass3H0) A0B).A03.A0E((String) A0G.A00, "DISTINCT_SYMBOL_FROM_EMOJI_SEARCH_TAG", (String[]) A0G.A01);
                    int columnIndexOrThrow = A0E.getColumnIndexOrThrow("symbol");
                    while (A0E.moveToNext()) {
                        A0K.add(C106655Zv.A00(A0E.getString(columnIndexOrThrow)));
                    }
                    A0E.close();
                    A0B.close();
                } catch (Throwable th) {
                    A0B.close();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException e) {
                Log.e((Throwable) e);
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        if (A17.size() < i) {
            LinkedHashSet A172 = AnonymousClass0x9.A17();
            if (!A0K.isEmpty()) {
                for (Object next : list) {
                    if (A0K.contains(next)) {
                        A172.add(next);
                        A0K.remove(next);
                    }
                }
            }
            A17.addAll(A172);
        }
        if (A17.size() < i) {
            LinkedHashSet A173 = AnonymousClass0x9.A17();
            if (!A0K.isEmpty()) {
                for (Object next2 : list2) {
                    if (A0K.contains(next2)) {
                        A173.add(next2);
                        A0K.remove(next2);
                    }
                }
            }
            A17.addAll(A173);
        }
        if (A17.size() < i && A0K.size() > 0) {
            ArrayList A0y = C18290x4.A0y(A0K);
            A0y.addAll(A0K);
            synchronized (this) {
                r1 = this.A00;
                if (r1 == null) {
                    r1 = new C71903cr(C155677fI.A00(this.A06));
                    this.A00 = r1;
                }
            }
            Collections.sort(A0y, r1);
            A17.addAll(A0y);
            return A17;
        }
        return A17;
        throw th;
    }

    public void BmT(boolean z) {
        C18260x0.A1E("emojidictionarystore/setIsFetched:", AnonymousClass001.A0o(), z);
        this.A01 = z;
    }
}
