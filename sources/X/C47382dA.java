package X;

import android.app.ProgressDialog;
import android.util.SparseArray;
import com.whatsapp.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2dA  reason: invalid class name and case insensitive filesystem */
public class C47382dA {
    public final SparseArray A00;
    public final C151767Wf A01 = new C151767Wf(new AnonymousClass3ZT());
    public final AnonymousClass2ZM A02;
    public final C58502vM A03;
    public final AnonymousClass2MQ A04;
    public final String A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final WeakReference A08;
    public final Map A09;
    public final AtomicBoolean A0A = new AtomicBoolean(true);

    public SparseArray A00() {
        AnonymousClass3CE r1;
        SparseArray sparseArray = new SparseArray();
        HashMap A0t = AnonymousClass001.A0t();
        String str = this.A05;
        if (str != null) {
            C58502vM r5 = this.A03;
            synchronized (r5) {
                String str2 = r5.A01;
                boolean z = false;
                if (str2 != null && !str2.equals(str)) {
                    z = true;
                }
                r1 = r5.A00;
                if (r1 == null || z) {
                    r5.A01 = str;
                    r1 = new AnonymousClass3CE(new C48342ek());
                    r5.A00 = r1;
                }
            }
            A0t.put("gs", r1);
        }
        A0t.put("ls", new AnonymousClass8D7());
        Map map = this.A09;
        if (map != null && !map.isEmpty()) {
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A0t.put(A0w.getKey(), ((AnonymousClass49E) A0w.getValue()).B3q());
            }
        }
        sparseArray.put(R.id.bk_context_key_data_modules, A0t);
        sparseArray.put(R.id.bloks_host_activity, this.A06.get());
        sparseArray.put(R.id.bloks_host_progress_dialog, this.A08.get());
        sparseArray.put(R.id.bloks_host_fragment_manager, this.A07.get());
        sparseArray.put(R.id.bloks_host_viewpoint_manager, this.A01);
        sparseArray.put(R.id.bloks_host_viewpoint_impressions_map, AnonymousClass001.A0t());
        sparseArray.put(R.id.bloks_data_module_namespace_manager, this.A04);
        return sparseArray;
    }

    public C47382dA(C009707r r3, C08270df r4, C58502vM r5, AnonymousClass2IQ r6, AnonymousClass2MQ r7, String str, Map map, boolean z) {
        this.A05 = str;
        this.A06 = AnonymousClass0x9.A14(r3);
        this.A07 = AnonymousClass0x9.A14(r4);
        this.A08 = AnonymousClass0x9.A14(new ProgressDialog(r3));
        this.A09 = map;
        this.A04 = r7;
        this.A02 = new AnonymousClass2ZM(this, r6, z);
        this.A03 = r5;
        this.A00 = new SparseArray();
    }
}
