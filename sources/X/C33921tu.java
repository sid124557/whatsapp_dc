package X;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1tu  reason: invalid class name and case insensitive filesystem */
public class C33921tu extends AnonymousClass5ZM {
    public long A00;
    public String A01;
    public final Pair A02;
    public final C85014Ep A03 = new C86564Kp(this, 4);
    public final C56512s6 A04;
    public final C61072zf A05;
    public final C631938h A06;
    public final C27991fJ A07;
    public final C43272Rm A08;
    public final C622734j A09;
    public final C49952hM A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String str;
        Pair A0C2;
        FileOutputStream fileOutputStream;
        C89654ea r14 = this.A08.A00;
        if (r14.isFinishing()) {
            return null;
        }
        if (!this.A0E) {
            return new AnonymousClass2P3((File) null, (String) null, (String) null);
        }
        C61072zf r2 = this.A05;
        long A032 = r2.A03();
        this.A01 = Environment.getExternalStorageState();
        if (this.A04.A07(this.A03)) {
            this.A00 = r2.A02();
        }
        C49952hM r4 = this.A0A;
        String str2 = this.A0B;
        String str3 = this.A0C;
        long j = this.A00;
        String str4 = this.A01;
        Pair pair = this.A02;
        List list = this.A0D;
        C27991fJ r7 = this.A07;
        synchronized (r4) {
            C622734j r3 = r4.A04;
            r3.A07();
            String A042 = r3.A04(r14, pair, r7, str2, str3, (String) null, str4, list, (List) null, (JSONObject) null, j, A032, true, false);
            Log.i(A042);
            File A0A2 = AnonymousClass002.A0A(r14.getFilesDir(), "debuginfo.json");
            if (!A0A2.exists() || A0A2.delete()) {
                try {
                    fileOutputStream = new FileOutputStream(A0A2, true);
                    AnonymousClass0x2.A1L(A042, fileOutputStream);
                    fileOutputStream.close();
                } catch (IOException e) {
                    Log.e("debug-builder/infofile/skip", e);
                    A0A2 = null;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } else {
                Log.e("debug-builder/infofile/error");
                A0A2 = null;
            }
            Log.rotate();
            Log.compress();
            r4.A00();
            File A033 = r3.A03(A0A2, 3, true, true);
            if (A033 == null || A033.length() > 5242880) {
                r4.A00();
                A033 = r3.A03(A0A2, 3, false, false);
                str = r3.A06((String) null);
            } else {
                str = null;
            }
            A0C2 = AnonymousClass0x9.A0C(A033, str);
        }
        String str5 = (String) A0C2.second;
        return new AnonymousClass2P3((File) A0C2.first, this.A09.A04(r14, pair, r7, str2, str3, str5, this.A01, list, AnonymousClass27R.A00(this.A06), (JSONObject) null, this.A00, A032, false, false), str5);
        throw th;
    }

    public void A0A() {
        C43272Rm r0 = this.A08;
        if (r0 != null) {
            C89654ea r1 = r0.A00;
            if (!r1.isFinishing()) {
                r1.Bp9(R.string.f11nameremoved);
            }
        }
        C622734j r3 = this.A09;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("contactsupporttask");
        C18260x0.A1K(A0o, ": PRIVACY SETTINGS BEGIN");
        Iterator A0j = AnonymousClass0x2.A0j(r3.A0f);
        while (A0j.hasNext()) {
            ((C84944Ei) A0j.next()).BKL("contactsupporttask");
        }
        C18260x0.A1K(AnonymousClass000.A0l("contactsupporttask"), ": PRIVACY SETTINGS END");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        boolean z;
        String str;
        String str2;
        AnonymousClass2P3 r1 = (AnonymousClass2P3) obj;
        C43272Rm r0 = this.A08;
        if (r0 != null && r1 != null) {
            File file = r1.A00;
            String str3 = r1.A01;
            String str4 = r1.A02;
            C89654ea r14 = r0.A00;
            C47362d8 r4 = r0.A01;
            C45742aV r13 = r4.A02;
            String str5 = r0.A02;
            ArrayList arrayList = r0.A04;
            String str6 = r0.A03;
            String string = r14.getString(R.string.f11nameremoved);
            StringBuilder A0o = AnonymousClass001.A0o();
            if (str5 != null) {
                A0o.append(str5);
            }
            if (!TextUtils.isEmpty(str3)) {
                A0o.append(str3);
            } else {
                A0o.append("\n");
            }
            StringBuilder A0A2 = C18330xA.A0A(A0o.toString());
            if (arrayList == null || arrayList.isEmpty()) {
                z = false;
                str = "android.intent.action.SEND";
            } else {
                z = true;
                str = "android.intent.action.SEND_MULTIPLE";
            }
            Intent A092 = AnonymousClass0x9.A09(str);
            C18260x0.A0q("email-sender/send-email uploadedLogsId is ", str4, AnonymousClass001.A0o());
            C18260x0.A0q("email-sender/send-email emailAddress: ", str6, AnonymousClass001.A0o());
            if (file == null) {
                A092.setType("plain/text");
                A0A2.append("No log file to attach.\n");
            } else {
                if (z) {
                    str2 = "*/*";
                } else {
                    str2 = "application/zip";
                }
                A092.setType(str2);
                A092.setFlags(1);
                r13.A03.A00();
                Uri A062 = MediaProvider.A06("support", "logs");
                if (z) {
                    arrayList.add(A062);
                } else {
                    A092.putExtra("android.intent.extra.STREAM", A062);
                }
            }
            String[] strArr = new String[1];
            if (str6 == null) {
                str6 = "android@support.whatsapp.com";
            }
            strArr[0] = str6;
            A092.putExtra("android.intent.extra.EMAIL", strArr);
            A092.putExtra("android.intent.extra.SUBJECT", string);
            A092.putExtra("android.intent.extra.TEXT", A0A2.toString());
            if (r13.A02.A0Y(C58422vE.A02, 1664)) {
                A092.putExtra("android.intent.extra.CC", new String[]{"bugs@whatsapp.com"});
            }
            if (z) {
                A092.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                ArrayList A0J = AnonymousClass002.A0J(arrayList);
                ClipData clipData = new ClipData(string, new String[]{"application/zip", "image/*"}, new ClipData.Item((Uri) A0J.get(0)));
                A0J.remove(0);
                Iterator it = A0J.iterator();
                while (it.hasNext()) {
                    clipData.addItem(new ClipData.Item((Uri) it.next()));
                }
                A092.setClipData(clipData);
                A092.setFlags(1);
            }
            boolean A002 = r13.A00(r14, A092, r14, r14.getString(R.string.f11nameremoved), true);
            r14.BjL();
            if (r14 instanceof AnonymousClass4BX) {
                ((AnonymousClass4BX) r14).Ba0(A002);
            }
            r4.A01 = null;
        }
    }

    public C33921tu(Pair pair, C56512s6 r4, C61072zf r5, C631938h r6, C27991fJ r7, C43272Rm r8, C622734j r9, C49952hM r10, String str, String str2, List list, boolean z) {
        this.A05 = r5;
        this.A09 = r9;
        this.A04 = r4;
        this.A0A = r10;
        this.A08 = r8;
        this.A0B = str;
        this.A0C = str2;
        this.A02 = pair;
        this.A0D = list;
        this.A0E = z;
        this.A06 = r6;
        this.A07 = r7;
    }
}
