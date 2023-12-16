package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.product.newsletterenforcements.alerts.NewsletterAlertsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.42y  reason: invalid class name and case insensitive filesystem */
public final class C822742y extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterAlertsActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C822742y(NewsletterAlertsActivity newsletterAlertsActivity) {
        super(1);
        this.this$0 = newsletterAlertsActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        RecyclerView recyclerView = this.this$0.A00;
        if (recyclerView == null) {
            throw C18270x1.A0S("recyclerView");
        }
        C162457s7.A0H(list);
        int i = 8;
        recyclerView.setVisibility(AnonymousClass001.A08(list.isEmpty() ^ true ? 1 : 0));
        AnonymousClass5UY r0 = this.this$0.A08;
        if (r0 == null) {
            throw C18270x1.A0S("loadingIndicator");
        }
        View A04 = r0.A04();
        C162457s7.A0D(A04);
        A04.setVisibility(8);
        NewsletterAlertsActivity newsletterAlertsActivity = this.this$0;
        AnonymousClass5UY r02 = newsletterAlertsActivity.A07;
        if (r02 == null) {
            throw C18270x1.A0S("emptyResultsLayout");
        }
        View A042 = r02.A04();
        C162457s7.A0D(A042);
        if (list.isEmpty()) {
            i = 0;
        }
        A042.setVisibility(i);
        WaTextView waTextView = (WaTextView) C18290x4.A0N(newsletterAlertsActivity, R.id.empty_results_body_text);
        String A0e = C18300x5.A0e(newsletterAlertsActivity, "clickable-span", new Object[1], 0, R.string.f11nameremoved);
        C106715a2 r4 = newsletterAlertsActivity.A06;
        if (r4 != null) {
            waTextView.setText(r4.A06(newsletterAlertsActivity, C71263bp.A00(newsletterAlertsActivity, 40), A0e, "clickable-span", AnonymousClass0x2.A05(waTextView)));
            C18270x1.A0q(waTextView, waTextView.getAbProps());
            C196211x r42 = this.this$0.A04;
            if (r42 == null) {
                throw C18270x1.A0S("adapter");
            }
            if (!list.isEmpty()) {
                C73723fy.A0L(list, new AnonymousClass4IU(29));
                ArrayList A0J = AnonymousClass002.A0J(list);
                Iterator it = A0J.iterator();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    int i4 = -1;
                    if (!it.hasNext()) {
                        break;
                    } else if (!(it.next() instanceof AnonymousClass1kY)) {
                        i3++;
                    } else if (i3 != -1) {
                        Iterator it2 = A0J.iterator();
                        int i5 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (!(it2.next() instanceof C29581ka)) {
                                i5++;
                            } else if (i5 != -1) {
                                Iterator it3 = A0J.iterator();
                                int i6 = 0;
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (it3.next() instanceof AnonymousClass1kY) {
                                            break;
                                        }
                                        i6++;
                                    } else {
                                        i6 = -1;
                                        break;
                                    }
                                }
                                A0J.add(i6, new AnonymousClass1kZ(R.string.f11nameremoved));
                                Iterator it4 = A0J.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    } else if (it4.next() instanceof C29581ka) {
                                        i4 = i2;
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                A0J.add(i4, new AnonymousClass1kZ(R.string.f11nameremoved));
                            }
                        }
                    }
                }
                r42.A00 = A0J;
                r42.A05();
            }
            return C59022wD.A00;
        }
        throw C18270x1.A0S("linkifier");
    }
}
