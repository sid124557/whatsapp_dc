package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import com.whatsapp.WaEditText;
import com.whatsapp.polls.PollCreatorViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.52P  reason: invalid class name */
public class AnonymousClass52P extends C166677z5 {
    public final /* synthetic */ C620633i A00;
    public final /* synthetic */ AnonymousClass487 A01;
    public final /* synthetic */ AnonymousClass5Y0 A02;
    public final /* synthetic */ C97484yO A03;
    public final /* synthetic */ PollCreatorViewModel A04;
    public final /* synthetic */ C60152y5 A05;

    public AnonymousClass52P(C620633i r1, AnonymousClass487 r2, AnonymousClass5Y0 r3, C97484yO r4, PollCreatorViewModel pollCreatorViewModel, C60152y5 r6) {
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = pollCreatorViewModel;
    }

    public void afterTextChanged(Editable editable) {
        C97484yO r4 = this.A03;
        if (r4.A01() != -1) {
            String obj = editable.toString();
            String replace = obj.replace("\n", "");
            if (TextUtils.equals(obj, replace)) {
                String obj2 = editable.toString();
                WaEditText waEditText = r4.A02;
                Context context = waEditText.getContext();
                AnonymousClass5Y0 r6 = this.A02;
                C620633i r3 = this.A00;
                C60152y5 r2 = this.A05;
                TextPaint paint = waEditText.getPaint();
                C18270x1.A11(context, 1, r6);
                C107345b9.A08(context, paint, editable, r6, 1.3f);
                C107635bd.A0M(editable, false);
                C107635bd.A09(r3, r2, editable, paint.getColor(), true);
                C107345b9.A07(waEditText.getContext(), waEditText.getPaint(), editable, r6);
                int A012 = r4.A01() - 2;
                PollCreatorViewModel pollCreatorViewModel = this.A04;
                List list = pollCreatorViewModel.A0E;
                if (list.size() < pollCreatorViewModel.A06.A0N(1408) && obj2.length() == 1) {
                    if (AnonymousClass002.A04(list, 1) != A012) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((C97504yQ) it.next()).A00.isEmpty()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    int i = pollCreatorViewModel.A01;
                    pollCreatorViewModel.A01 = i + 1;
                    list.add(new C97504yQ(i));
                    pollCreatorViewModel.A0D();
                    pollCreatorViewModel.A0C.A0G(AnonymousClass002.A0D());
                }
                if (pollCreatorViewModel.A0F(obj2, A012)) {
                    boolean A0E = pollCreatorViewModel.A0E(A012);
                    int i2 = pollCreatorViewModel.A00;
                    if (A0E) {
                        if (A012 != i2) {
                            C06270Wx.A04(pollCreatorViewModel.A02, AnonymousClass002.A03(list));
                            pollCreatorViewModel.A00 = A012;
                            pollCreatorViewModel.A0C.A0G(AnonymousClass002.A0D());
                        }
                    } else if (i2 != -1) {
                        C06270Wx.A04(pollCreatorViewModel.A02, -1);
                        pollCreatorViewModel.A00 = -1;
                    }
                    int i3 = r4.A00;
                    int i4 = 0;
                    while (true) {
                        List list2 = pollCreatorViewModel.A0D;
                        if (i4 >= list2.size()) {
                            break;
                        } else if (i3 == AnonymousClass000.A09(list2, i4)) {
                            list2.remove(i4);
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                Editable text = waEditText.getText();
                if (text != null) {
                    Drawable drawable = r4.A01;
                    boolean isEmpty = text.toString().isEmpty();
                    int i5 = 255;
                    if (isEmpty) {
                        i5 = 0;
                    }
                    drawable.setAlpha(i5);
                    return;
                }
                return;
            }
            editable.clear();
            editable.append(replace);
        }
    }
}
