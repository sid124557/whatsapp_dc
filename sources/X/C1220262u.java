package X;

import android.view.View;
import android.widget.ListView;
import com.whatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;

/* renamed from: X.62u  reason: invalid class name and case insensitive filesystem */
public final class C1220262u extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ View $progress;
    public final /* synthetic */ InviteNonWhatsAppContactPickerActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1220262u(View view, InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity) {
        super(1);
        this.$progress = view;
        this.this$0 = inviteNonWhatsAppContactPickerActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Number number = (Number) obj;
        if (number != null) {
            int intValue = number.intValue();
            if (intValue == 0) {
                this.$progress.setVisibility(0);
            } else if (intValue == 1) {
                this.$progress.setVisibility(8);
                InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity = this.this$0;
                C44772Xk r0 = inviteNonWhatsAppContactPickerActivity.A0A;
                if (r0 != null) {
                    InviteNonWhatsAppContactPickerActivity.A0C(inviteNonWhatsAppContactPickerActivity, r0.A00());
                } else {
                    throw C18270x1.A0S("contactAccessHelper");
                }
            } else if (intValue == 2) {
                this.$progress.setVisibility(8);
                InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity2 = this.this$0;
                if (inviteNonWhatsAppContactPickerActivity2.getListView().getHeaderViewsCount() == 0) {
                    ListView listView = inviteNonWhatsAppContactPickerActivity2.getListView();
                    View view = inviteNonWhatsAppContactPickerActivity2.A03;
                    if (view == null) {
                        throw C18270x1.A0S("listViewHeader");
                    }
                    listView.addHeaderView(view);
                }
                ListView listView2 = inviteNonWhatsAppContactPickerActivity2.getListView();
                View view2 = inviteNonWhatsAppContactPickerActivity2.A02;
                if (view2 == null) {
                    throw C18270x1.A0S("listViewFooter");
                }
                listView2.removeFooterView(view2);
            } else if (intValue == 3) {
                this.$progress.setVisibility(8);
                InviteNonWhatsAppContactPickerActivity inviteNonWhatsAppContactPickerActivity3 = this.this$0;
                if (inviteNonWhatsAppContactPickerActivity3.getListView().getFooterViewsCount() == 0) {
                    ListView listView3 = inviteNonWhatsAppContactPickerActivity3.getListView();
                    View view3 = inviteNonWhatsAppContactPickerActivity3.A02;
                    if (view3 == null) {
                        throw C18270x1.A0S("listViewFooter");
                    }
                    listView3.addFooterView(view3);
                }
                ListView listView4 = inviteNonWhatsAppContactPickerActivity3.getListView();
                View view4 = inviteNonWhatsAppContactPickerActivity3.A03;
                if (view4 == null) {
                    throw C18270x1.A0S("listViewHeader");
                }
                listView4.removeHeaderView(view4);
            }
        }
        return C59022wD.A00;
    }
}
