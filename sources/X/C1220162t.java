package X;

import android.content.res.Resources;
import com.whatsapp.R;
import com.whatsapp.community.subgroup.views.CommunityViewGroupsView;

/* renamed from: X.62t  reason: invalid class name and case insensitive filesystem */
public final class C1220162t extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ C009707r $activity;
    public final /* synthetic */ CommunityViewGroupsView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1220162t(C009707r r2, CommunityViewGroupsView communityViewGroupsView) {
        super(1);
        this.$activity = r2;
        this.this$0 = communityViewGroupsView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int A0K = AnonymousClass001.A0K(obj);
        Resources resources = this.$activity.getResources();
        Object[] A0L = AnonymousClass002.A0L();
        C18270x1.A1Q(A0L, A0K);
        String string = resources.getString(R.string.f11nameremoved, A0L);
        C162457s7.A0D(string);
        this.this$0.A06.setTitle(string);
        return C59022wD.A00;
    }
}
