package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: X.8J4  reason: invalid class name */
public class AnonymousClass8J4 implements C185108t6 {
    public int A00;
    public C153137aj A01;
    public final View A02;
    public final LinearLayoutManager A03;
    public final C125256Hc A04;
    public final ArrayList A05 = AnonymousClass001.A0s();

    public View BEH() {
        return this.A02;
    }

    public void BXf(int i) {
        ArrayList arrayList;
        C188818zX r2;
        int i2 = this.A00;
        if (i != i2) {
            int i3 = 0;
            while (true) {
                arrayList = this.A05;
                if (i3 < arrayList.size()) {
                    if (i2 == ((AnonymousClass7V0) arrayList.get(i3)).A00()) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            this.A00 = i;
            int i4 = 0;
            while (true) {
                if (i4 < arrayList.size()) {
                    if (i == ((AnonymousClass7V0) arrayList.get(i4)).A00()) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 != i3) {
                LinearLayoutManager linearLayoutManager = this.A03;
                int A1G = linearLayoutManager.A1G();
                int A1I = linearLayoutManager.A1I();
                int i5 = ((A1I - A1G) * 2) / 5;
                int i6 = i4 - i5;
                if (i6 < A1G) {
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    r2 = new C188818zX(this.A02.getContext(), this, 5);
                    r2.A00 = i6;
                } else {
                    int i7 = i4 + i5;
                    if (i7 > A1I) {
                        if (i7 >= linearLayoutManager.A09()) {
                            i7 = linearLayoutManager.A09() - 1;
                        }
                        r2 = new C188818zX(this.A02.getContext(), this, 5);
                        r2.A00 = i7;
                    }
                }
                linearLayoutManager.A0x(r2);
            }
            C153137aj r0 = this.A01;
            if (r0 != null) {
                r0.A03(i);
            }
            this.A04.A05();
        }
    }

    public void Bm2(C153137aj r4) {
        this.A01 = r4;
        if (r4 != null) {
            int A022 = r4.A02();
            if (A022 < 0) {
                C18320x8.A1J("AvatarPickerHeader/setContentPicker/getCurrentPageIndex < 0", Locale.US, AnonymousClass4L0.A0U());
                A022 = 0;
            }
            BXf(A022);
        }
    }

    public AnonymousClass8J4(View view) {
        this.A02 = view.findViewById(R.id.avatar_picker_header);
        RecyclerView recyclerView = (RecyclerView) C06560Yg.A02(view, R.id.avatar_header_recycler);
        recyclerView.A0h = false;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
        this.A03 = linearLayoutManager;
        linearLayoutManager.A1X(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        C125256Hc r0 = new C125256Hc(this);
        this.A04 = r0;
        recyclerView.setAdapter(r0);
    }
}
