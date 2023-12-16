package X;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.List;
import java.util.Set;

/* renamed from: X.0fC  reason: invalid class name and case insensitive filesystem */
public final class C08840fC implements C16710tq {
    public static final AnonymousClass0Y1 A03 = new AnonymousClass0Y1();
    public final AnonymousClass0Q7 A00;
    public final AnonymousClass0UX A01;
    public final ActivityEmbeddingComponent A02;

    public C08840fC(AnonymousClass0Q7 r2, AnonymousClass0UX r3, ActivityEmbeddingComponent activityEmbeddingComponent) {
        C162457s7.A0J(activityEmbeddingComponent, 1);
        this.A02 = activityEmbeddingComponent;
        this.A01 = r3;
        this.A00 = r2;
    }

    public void BmD(C15300r7 r5) {
        this.A00.A03(this.A02, new C14320pM(this, r5), C57982uW.A00(List.class));
    }

    public void BnP(Set set) {
        this.A02.setEmbeddingRules(this.A01.A0A(set));
    }
}
