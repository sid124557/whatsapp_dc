package X;

import android.util.JsonWriter;
import com.whatsapp.util.Log;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3Ps  reason: invalid class name and case insensitive filesystem */
public class C67553Ps implements AnonymousClass4ET {
    public final C56352rq A00;
    public final C54292oU A01;
    public final AnonymousClass5Y0 A02;
    public final C55732qp A03;
    public final AnonymousClass33O A04;
    public final Map A05 = AnonymousClass0x9.A1D();

    public /* bridge */ /* synthetic */ AnonymousClass4F8 B0c(Object obj, float f) {
        return new C67563Pt((C85164Fe) obj, Float.valueOf(1.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (r2.equals("weight") == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0147, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x014c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:69:0x012e, B:83:0x0143] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[Catch:{ all -> 0x0137, all -> 0x013c, all -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0076 A[Catch:{ all -> 0x0137, all -> 0x013c, all -> 0x0141 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List BFm() {
        /*
            r15 = this;
            X.2oU r0 = r15.A01
            java.io.File r1 = X.C54292oU.A03(r0)
            java.lang.String r0 = "content_stickers"
            java.io.File r14 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r14.exists()
            r4 = 0
            if (r0 == 0) goto L_0x0167
            java.io.FileInputStream r5 = X.AnonymousClass0x9.A0g(r14)     // Catch:{ Exception -> 0x0159 }
            java.lang.String r0 = X.C58152un.A0B     // Catch:{ all -> 0x014e }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x014e }
            r6.<init>(r5, r0)     // Catch:{ all -> 0x014e }
            android.util.JsonReader r7 = new android.util.JsonReader     // Catch:{ all -> 0x0141 }
            r7.<init>(r6)     // Catch:{ all -> 0x0141 }
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0137 }
            r7.beginArray()     // Catch:{ all -> 0x0137 }
        L_0x002a:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x012b
            r7.beginObject()     // Catch:{ all -> 0x0137 }
            r8 = r4
            r9 = r4
        L_0x0035:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0137 }
            r13 = 1
            if (r0 == 0) goto L_0x007b
            java.lang.String r2 = r7.nextName()     // Catch:{ all -> 0x0137 }
            int r1 = r2.hashCode()     // Catch:{ all -> 0x0137 }
            r0 = -791592328(0xffffffffd0d14278, float:-2.80863539E10)
            if (r1 == r0) goto L_0x0059
            r0 = 114586(0x1bf9a, float:1.60569E-40)
            if (r1 != r0) goto L_0x0063
            java.lang.String r0 = "tag"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0137 }
            r1 = 0
            if (r0 != 0) goto L_0x0064
            goto L_0x0063
        L_0x0059:
            java.lang.String r0 = "weight"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0137 }
            r1 = 1
            if (r0 != 0) goto L_0x0064
        L_0x0063:
            r1 = -1
        L_0x0064:
            if (r1 == 0) goto L_0x0076
            if (r1 == r13) goto L_0x006c
            r7.skipValue()     // Catch:{ all -> 0x0137 }
            goto L_0x0035
        L_0x006c:
            double r0 = r7.nextDouble()     // Catch:{ all -> 0x0137 }
            float r2 = (float) r0     // Catch:{ all -> 0x0137 }
            java.lang.Float r9 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0137 }
            goto L_0x0035
        L_0x0076:
            java.lang.String r8 = r7.nextString()     // Catch:{ all -> 0x0137 }
            goto L_0x0035
        L_0x007b:
            r7.endObject()     // Catch:{ all -> 0x0137 }
            if (r8 == 0) goto L_0x0120
            if (r9 == 0) goto L_0x0120
            java.util.Map r2 = r15.A05     // Catch:{ all -> 0x0137 }
            java.lang.Object r11 = r2.get(r8)     // Catch:{ all -> 0x0137 }
            X.4Fe r11 = (X.C85164Fe) r11     // Catch:{ all -> 0x0137 }
            if (r11 != 0) goto L_0x010e
            java.lang.String r1 = "StickerShapeCreator:"
            boolean r0 = r8.startsWith(r1)     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = ""
            java.lang.String r12 = r8.replace(r1, r0)     // Catch:{ all -> 0x0137 }
            goto L_0x009c
        L_0x009b:
            r12 = 0
        L_0x009c:
            if (r12 == 0) goto L_0x00da
            X.2rq r0 = r15.A00     // Catch:{ all -> 0x0137 }
            java.io.File r10 = r0.A02(r12)     // Catch:{ all -> 0x0137 }
            boolean r0 = r10.exists()     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x010e
            X.39M r1 = new X.39M     // Catch:{ all -> 0x0137 }
            r1.<init>()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ all -> 0x0137 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x00bb
            r0 = r4
            goto L_0x00c1
        L_0x00bb:
            X.2qp r0 = r15.A03     // Catch:{ all -> 0x0137 }
            X.330 r0 = r0.A02(r10, r4)     // Catch:{ all -> 0x0137 }
        L_0x00c1:
            r1.A04 = r0     // Catch:{ all -> 0x0137 }
            r1.A0D = r12     // Catch:{ all -> 0x0137 }
            X.AnonymousClass39M.A01(r1, r10)     // Catch:{ all -> 0x0137 }
            r1.A01 = r13     // Catch:{ all -> 0x0137 }
            X.2qp r0 = r15.A03     // Catch:{ all -> 0x0137 }
            r0.A04(r1)     // Catch:{ all -> 0x0137 }
            X.33O r0 = r15.A04     // Catch:{ all -> 0x0137 }
            X.3QV r10 = new X.3QV     // Catch:{ all -> 0x0137 }
            r10.<init>(r1, r0)     // Catch:{ all -> 0x0137 }
            r2.put(r8, r10)     // Catch:{ all -> 0x0137 }
            goto L_0x010d
        L_0x00da:
            java.lang.String r1 = "EmojiShapeCreator:"
            boolean r0 = r8.startsWith(r1)     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x00e9
            java.lang.String r0 = ""
            java.lang.String r8 = r8.replace(r1, r0)     // Catch:{ all -> 0x0137 }
            goto L_0x00ea
        L_0x00e9:
            r8 = 0
        L_0x00ea:
            if (r8 == 0) goto L_0x010e
            X.5Y0 r1 = r15.A02     // Catch:{ IllegalArgumentException -> 0x0102 }
            X.5Zv r0 = new X.5Zv     // Catch:{ IllegalArgumentException -> 0x0102 }
            r0.<init>((java.lang.String) r8)     // Catch:{ IllegalArgumentException -> 0x0102 }
            X.3QU r10 = new X.3QU     // Catch:{ IllegalArgumentException -> 0x0102 }
            r10.<init>(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0102 }
            java.lang.String r0 = r10.BDW()     // Catch:{ IllegalArgumentException -> 0x0100 }
            r2.put(r0, r10)     // Catch:{ IllegalArgumentException -> 0x0100 }
            goto L_0x010d
        L_0x0100:
            r2 = move-exception
            goto L_0x0104
        L_0x0102:
            r2 = move-exception
            r10 = r11
        L_0x0104:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "Unable to create emoji shape creator from "
            X.C18260x0.A0u(r0, r8, r1, r2)     // Catch:{ all -> 0x0137 }
        L_0x010d:
            r11 = r10
        L_0x010e:
            if (r11 == 0) goto L_0x002a
            boolean r0 = r11.AyR()     // Catch:{ all -> 0x0137 }
            if (r0 == 0) goto L_0x002a
            X.3Pt r0 = new X.3Pt     // Catch:{ all -> 0x0137 }
            r0.<init>(r11, r9)     // Catch:{ all -> 0x0137 }
            r3.add(r0)     // Catch:{ all -> 0x0137 }
            goto L_0x002a
        L_0x0120:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0137 }
            java.lang.String r0 = "RecentShapesHelper/init/ tag or weight is null for tag="
            X.C18260x0.A0r(r0, r8, r1)     // Catch:{ all -> 0x0137 }
            goto L_0x002a
        L_0x012b:
            r7.close()     // Catch:{ all -> 0x0135 }
            r6.close()     // Catch:{ all -> 0x014c }
            r5.close()     // Catch:{ Exception -> 0x015b }
            goto L_0x0166
        L_0x0135:
            r1 = move-exception
            goto L_0x0143
        L_0x0137:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x013c }
            goto L_0x0140
        L_0x013c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0141 }
        L_0x0140:
            throw r1     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r1 = move-exception
            r3 = r4
        L_0x0143:
            r6.close()     // Catch:{ all -> 0x0147 }
            goto L_0x014b
        L_0x0147:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x014c }
        L_0x014b:
            throw r1     // Catch:{ all -> 0x014c }
        L_0x014c:
            r1 = move-exception
            goto L_0x0150
        L_0x014e:
            r1 = move-exception
            r3 = r4
        L_0x0150:
            r5.close()     // Catch:{ all -> 0x0154 }
            goto L_0x0158
        L_0x0154:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x015b }
        L_0x0158:
            throw r1     // Catch:{ Exception -> 0x015b }
        L_0x0159:
            r1 = move-exception
            goto L_0x015d
        L_0x015b:
            r1 = move-exception
            r4 = r3
        L_0x015d:
            java.lang.String r0 = "RecentShapesHelper/init"
            com.whatsapp.util.Log.e(r0, r1)
            r14.delete()
            goto L_0x0167
        L_0x0166:
            r4 = r3
        L_0x0167:
            if (r4 != 0) goto L_0x016d
            java.util.ArrayList r4 = X.AnonymousClass001.A0s()
        L_0x016d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67553Ps.BFm():java.util.List");
    }

    public void Bgs(List list) {
        JsonWriter jsonWriter;
        try {
            FileOutputStream A0h = AnonymousClass0x9.A0h(AnonymousClass002.A0A(C54292oU.A03(this.A01), "content_stickers"));
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(A0h, C58152un.A0B);
                try {
                    jsonWriter = new JsonWriter(outputStreamWriter);
                    jsonWriter.setIndent("");
                    jsonWriter.beginArray();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C67563Pt r4 = (C67563Pt) it.next();
                        jsonWriter.beginObject();
                        jsonWriter.name("tag").value(r4.A01.BDW());
                        jsonWriter.name("weight").value((double) r4.A00);
                        jsonWriter.endObject();
                    }
                    jsonWriter.endArray();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    A0h.close();
                    return;
                } catch (Throwable th) {
                    outputStreamWriter.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                A0h.close();
                throw th2;
            }
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    public C67553Ps(C56352rq r5, C54292oU r6, AnonymousClass5Y0 r7, C55732qp r8, AnonymousClass33O r9) {
        this.A01 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A04 = r9;
        this.A00 = r5;
        List<C85164Fe> A002 = C58022ua.A00();
        for (C85164Fe r2 : A002) {
            this.A05.put(r2.BDW(), r2);
        }
    }
}
