package X;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4Vf  reason: invalid class name and case insensitive filesystem */
public class C87704Vf extends AnonymousClass08c {
    public List A00;
    public final C620733j A01;
    public final AnonymousClass1VX A02;
    public final File[] A03;

    public void A03() {
        List list = this.A00;
        if (list != null && !this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A04(list);
            }
        }
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        if (z || this.A00 == null) {
            A09();
        }
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        List list = (List) obj;
        if (!this.A05) {
            this.A00 = list;
            if (this.A06) {
                super.A04(list);
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A06() {
        ArrayList A0I = AnonymousClass002.A0I(128);
        for (File listFiles : this.A03) {
            File[] listFiles2 = listFiles.listFiles(new C116945r8());
            if (listFiles2 != null) {
                long A05 = C86624Kv.A05(this.A02, 542);
                for (File r0 : listFiles2) {
                    AnonymousClass5QG r3 = new AnonymousClass5QG(r0);
                    if (r3.A01 <= A05) {
                        A0I.add(r3);
                    }
                }
            }
        }
        Collator A0w = C86614Ku.A0w(this.A01);
        A0w.setDecomposition(1);
        Collections.sort(A0I, new AnonymousClass6A5(A0w, 5));
        return A0I;
    }

    public C87704Vf(Context context, C64393Dh r5, C620733j r6, AnonymousClass1VX r7) {
        super(context);
        this.A02 = r7;
        this.A01 = r6;
        this.A03 = new File[]{AnonymousClass002.A0A(Environment.getExternalStorageDirectory(), "Download"), Environment.getExternalStorageDirectory(), r5.A0A(), AnonymousClass002.A0A(Environment.getExternalStorageDirectory(), "Documents")};
    }

    public void A01() {
        A00();
        this.A00 = null;
    }

    public void A02() {
        A00();
    }
}
