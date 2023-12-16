package X;

import android.app.Activity;
import android.content.Intent;
import android.view.WindowMetrics;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0UX  reason: invalid class name */
public final class AnonymousClass0UX {
    public final AnonymousClass0P6 A00;

    public final ActivityRule A01(C01350Ag r7, Class cls) {
        Constructor<ActivityRule.Builder> constructor = ActivityRule.Builder.class.getConstructor(new Class[]{cls, cls});
        Set set = r7.A00;
        ActivityRule build = constructor.newInstance(new Object[]{A07(set), A08(set)}).setShouldAlwaysExpand(true).build();
        C162457s7.A0D(build);
        return build;
    }

    public final SplitPairRule A02(C01360Ah r8, Class cls) {
        Constructor<SplitPairRule.Builder> constructor = SplitPairRule.Builder.class.getConstructor(new Class[]{cls, cls, cls});
        Set set = r8.A00;
        SplitPairRule.Builder finishSecondaryWithPrimary = constructor.newInstance(new Object[]{A06(set), A05(set), A04(r8)}).setSplitRatio(0.4f).setLayoutDirection(3).setShouldClearTop(r8.A01).setFinishPrimaryWithSecondary(0).setFinishSecondaryWithPrimary(1);
        C162457s7.A0D(finishSecondaryWithPrimary);
        SplitPairRule build = finishSecondaryWithPrimary.build();
        C162457s7.A0D(build);
        return build;
    }

    public final SplitPlaceholderRule A03(C01370Ai r9, Class cls) {
        Constructor<SplitPlaceholderRule.Builder> constructor = SplitPlaceholderRule.Builder.class.getConstructor(new Class[]{Intent.class, cls, cls, cls});
        Set set = r9.A01;
        SplitPlaceholderRule.Builder finishPrimaryWithSecondary = constructor.newInstance(new Object[]{r9.A00, A07(set), A08(set), A04(r9)}).setSplitRatio(0.4f).setLayoutDirection(3).setSticky(false).setFinishPrimaryWithSecondary(1);
        C162457s7.A0D(finishPrimaryWithSecondary);
        SplitPlaceholderRule build = finishPrimaryWithSecondary.build();
        C162457s7.A0D(build);
        return build;
    }

    public final Object A04(C01380Aj r4) {
        return this.A00.A01(new C14230p9(r4), C57982uW.A00(WindowMetrics.class));
    }

    public final Object A05(Set set) {
        return this.A00.A02(new C14390pZ(set), C57982uW.A00(Activity.class), C57982uW.A00(Intent.class));
    }

    public final Object A06(Set set) {
        Class<Activity> cls = Activity.class;
        return this.A00.A02(new C14400pa(set), C57982uW.A00(cls), C57982uW.A00(cls));
    }

    public final Object A07(Set set) {
        return this.A00.A01(new C14210p7(set), C57982uW.A00(Activity.class));
    }

    public final Object A08(Set set) {
        return this.A00.A01(new C14220p8(set), C57982uW.A00(Intent.class));
    }

    public final List A09(List list) {
        ArrayList A0I = AnonymousClass002.A0I(C73783g4.A0b(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0I.add(A00((SplitInfo) it.next()));
        }
        return A0I;
    }

    public final Set A0A(Set set) {
        Class cls;
        SplitPairRule A01;
        try {
            cls = this.A00.A00();
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return C73833g9.A04();
        }
        ArrayList A0I = AnonymousClass002.A0I(C73783g4.A0b(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C03020In r1 = (C03020In) it.next();
            if (r1 instanceof C01360Ah) {
                A01 = A02((C01360Ah) r1, cls);
            } else if (r1 instanceof C01370Ai) {
                A01 = A03((C01370Ai) r1, cls);
            } else if (r1 instanceof C01350Ag) {
                A01 = A01((C01350Ag) r1, cls);
            } else {
                throw AnonymousClass001.A0c("Unsupported rule type");
            }
            A0I.add(A01);
        }
        return C73723fy.A0P(A0I);
    }

    public AnonymousClass0UX(AnonymousClass0P6 r1) {
        this.A00 = r1;
    }

    public static final AnonymousClass0PV A00(SplitInfo splitInfo) {
        boolean z;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        C162457s7.A0D(primaryActivityStack);
        boolean z2 = false;
        try {
            z = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z = false;
        }
        List activities = primaryActivityStack.getActivities();
        C162457s7.A0D(activities);
        AnonymousClass0QB r3 = new AnonymousClass0QB(activities, z);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        C162457s7.A0D(secondaryActivityStack);
        try {
            z2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        C162457s7.A0D(activities2);
        return new AnonymousClass0PV(r3, new AnonymousClass0QB(activities2, z2), splitInfo.getSplitRatio());
    }
}
