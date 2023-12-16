package X;

import android.text.TextUtils;
import android.util.Log;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.io.File;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: X.0mu  reason: invalid class name and case insensitive filesystem */
public class C13270mu implements Runnable {
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A00;
    public final /* synthetic */ List A01;

    public C13270mu(ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, List list) {
        this.A00 = shortcutInfoCompatSaverImpl;
        this.A01 = list;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|(1:4)|5|6|7|8|(15:10|11|12|13|(18:16|(1:18)|19|(1:21)|22|(1:24)|25|(1:27)|28|(1:30)|31|(3:33|(2:35|91)(1:92)|36)|90|37|(4:40|(2:42|96)(1:95)|93|38)|94|43|14)|89|44|45|46|49|(3:51|52|53)|54|55|60|61)(3:64|65|68)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0052 A[SYNTHETIC, Splitter:B:10:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018a A[SYNTHETIC, Splitter:B:64:0x018a] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01bc A[SYNTHETIC, Splitter:B:72:0x01bc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r17 = this;
            r1 = r17
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r0 = r1.A00
            java.util.List r2 = r1.A01
            r0.A05(r2)
            java.io.File r5 = r0.A02
            java.lang.String r11 = "share_targets"
            r10 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = ".new"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r6 = X.AnonymousClass002.A0B(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = ".bak"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            java.io.File r1 = X.AnonymousClass002.A0B(r0)
            r7 = 0
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x0042
            A00(r1, r5)     // Catch:{ Exception -> 0x01aa }
        L_0x0042:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0048 }
            r4.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0048 }
            goto L_0x0057
        L_0x0048:
            java.io.File r0 = r6.getParentFile()     // Catch:{ Exception -> 0x01aa }
            boolean r0 = r0.mkdirs()     // Catch:{ Exception -> 0x01aa }
            if (r0 == 0) goto L_0x018a
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0199 }
            r4.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0199 }
        L_0x0057:
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0187 }
            r9.<init>(r4)     // Catch:{ Exception -> 0x0187 }
            org.xmlpull.v1.XmlSerializer r8 = android.util.Xml.newSerializer()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "UTF_8"
            r8.setOutput(r9, r0)     // Catch:{ Exception -> 0x0187 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0187 }
            r8.startDocument(r10, r0)     // Catch:{ Exception -> 0x0187 }
            r8.startTag(r10, r11)     // Catch:{ Exception -> 0x0187 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ Exception -> 0x0187 }
        L_0x0071:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x015a
            java.lang.Object r2 = r16.next()     // Catch:{ Exception -> 0x0187 }
            X.0Lj r2 = (X.C03740Lj) r2     // Catch:{ Exception -> 0x0187 }
            java.lang.String r7 = "target"
            r8.startTag(r10, r7)     // Catch:{ Exception -> 0x0187 }
            X.0U1 r14 = r2.A00     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = r14.A0D     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "id"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
            java.lang.CharSequence r0 = r14.A0B     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "short_label"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
            int r0 = r14.A02     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "rank"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
            java.lang.CharSequence r0 = r14.A0C     // Catch:{ Exception -> 0x0187 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0187 }
            if (r0 != 0) goto L_0x00b4
            java.lang.CharSequence r0 = r14.A0C     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "long_label"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
        L_0x00b4:
            java.lang.CharSequence r0 = r14.A0A     // Catch:{ Exception -> 0x0187 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0187 }
            if (r0 != 0) goto L_0x00c7
            java.lang.CharSequence r0 = r14.A0A     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "disabled_message"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
        L_0x00c7:
            android.content.ComponentName r0 = r14.A04     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x00d4
            java.lang.String r1 = r0.flattenToString()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "component"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
        L_0x00d4:
            java.lang.String r1 = r2.A02     // Catch:{ Exception -> 0x0187 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0187 }
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "icon_resource_name"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
        L_0x00e1:
            java.lang.String r1 = r2.A01     // Catch:{ Exception -> 0x0187 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0187 }
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "icon_bitmap_path"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
        L_0x00ee:
            android.content.Intent[] r1 = r14.A0P     // Catch:{ Exception -> 0x0187 }
            int r0 = r1.length     // Catch:{ Exception -> 0x0187 }
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x0187 }
            android.content.Intent[] r13 = (android.content.Intent[]) r13     // Catch:{ Exception -> 0x0187 }
            int r12 = r13.length     // Catch:{ Exception -> 0x0187 }
            r3 = 0
        L_0x00f9:
            if (r3 >= r12) goto L_0x0131
            r15 = r13[r3]     // Catch:{ Exception -> 0x0187 }
            java.lang.String r2 = "intent"
            r8.startTag(r10, r2)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = r15.getAction()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "action"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x012b
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "targetPackage"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r1 = r0.getClassName()     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "targetClass"
            A01(r0, r1, r8)     // Catch:{ Exception -> 0x0187 }
        L_0x012b:
            r8.endTag(r10, r2)     // Catch:{ Exception -> 0x0187 }
            int r3 = r3 + 1
            goto L_0x00f9
        L_0x0131:
            java.util.Set r0 = r14.A0F     // Catch:{ Exception -> 0x0187 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ Exception -> 0x0187 }
        L_0x0137:
            boolean r0 = r3.hasNext()     // Catch:{ Exception -> 0x0187 }
            if (r0 == 0) goto L_0x0155
            java.lang.String r2 = X.AnonymousClass001.A0m(r3)     // Catch:{ Exception -> 0x0187 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0187 }
            if (r0 != 0) goto L_0x0137
            java.lang.String r1 = "categories"
            r8.startTag(r10, r1)     // Catch:{ Exception -> 0x0187 }
            java.lang.String r0 = "name"
            A01(r0, r2, r8)     // Catch:{ Exception -> 0x0187 }
            r8.endTag(r10, r1)     // Catch:{ Exception -> 0x0187 }
            goto L_0x0137
        L_0x0155:
            r8.endTag(r10, r7)     // Catch:{ Exception -> 0x0187 }
            goto L_0x0071
        L_0x015a:
            r8.endTag(r10, r11)     // Catch:{ Exception -> 0x0187 }
            r8.endDocument()     // Catch:{ Exception -> 0x0187 }
            r9.flush()     // Catch:{ Exception -> 0x0187 }
            r4.flush()     // Catch:{ Exception -> 0x0187 }
            java.io.FileDescriptor r0 = r4.getFD()     // Catch:{ IOException -> 0x016f }
            r0.sync()     // Catch:{ IOException -> 0x016f }
            r0 = 1
            goto L_0x0170
        L_0x016f:
            r0 = 0
        L_0x0170:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x0179
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x0187 }
        L_0x0179:
            r4.close()     // Catch:{ IOException -> 0x017d }
            goto L_0x0183
        L_0x017d:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)     // Catch:{ Exception -> 0x0187 }
        L_0x0183:
            A00(r6, r5)     // Catch:{ Exception -> 0x0187 }
            return
        L_0x0187:
            r3 = move-exception
            r7 = r4
            goto L_0x01ab
        L_0x018a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "Failed to create directory for "
            java.lang.String r0 = X.AnonymousClass000.A0P(r6, r0, r1)     // Catch:{ Exception -> 0x01aa }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ Exception -> 0x01aa }
            goto L_0x01a9
        L_0x0199:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x01aa }
            java.lang.String r0 = "Failed to create new file "
            java.lang.String r1 = X.AnonymousClass000.A0P(r6, r0, r1)     // Catch:{ Exception -> 0x01aa }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x01aa }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x01aa }
        L_0x01a9:
            throw r0     // Catch:{ Exception -> 0x01aa }
        L_0x01aa:
            r3 = move-exception
        L_0x01ab:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "Failed to write to file "
            java.lang.String r1 = X.AnonymousClass000.A0P(r5, r4, r0)
            java.lang.String r0 = "ShortcutInfoCompatSaver"
            android.util.Log.e(r0, r1, r3)
            if (r7 == 0) goto L_0x01ed
            java.io.FileDescriptor r0 = r7.getFD()     // Catch:{ IOException -> 0x01c4 }
            r0.sync()     // Catch:{ IOException -> 0x01c4 }
            goto L_0x01c6
        L_0x01c4:
            r0 = 0
            goto L_0x01c7
        L_0x01c6:
            r0 = 1
        L_0x01c7:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x01d0
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)
        L_0x01d0:
            r7.close()     // Catch:{ IOException -> 0x01d4 }
            goto L_0x01da
        L_0x01d4:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)
        L_0x01da:
            boolean r0 = r6.delete()
            if (r0 != 0) goto L_0x01ed
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to delete new file "
            java.lang.String r0 = X.AnonymousClass000.A0P(r6, r0, r1)
            android.util.Log.e(r2, r0)
        L_0x01ed:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            java.lang.String r1 = X.AnonymousClass000.A0P(r5, r4, r0)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13270mu.run():void");
    }

    public static void A00(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", AnonymousClass000.A0P(file2, "Failed to delete file which is a directory ", AnonymousClass001.A0o()));
        }
        if (!file.renameTo(file2)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Failed to rename ");
            A0o.append(file);
            Log.e("AtomicFile", AnonymousClass000.A0P(file2, " to ", A0o));
        }
    }

    public static void A01(String str, String str2, XmlSerializer xmlSerializer) {
        if (!TextUtils.isEmpty(str2)) {
            xmlSerializer.attribute((String) null, str, str2);
        }
    }
}
