package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.chatinfo.ListChatInfoActivity;
import java.util.List;

/* renamed from: X.4OP  reason: invalid class name */
public class AnonymousClass4OP extends ArrayAdapter {
    public final /* synthetic */ ListChatInfoActivity A00;

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass5J3 r0;
        TextEmojiLabel textEmojiLabel;
        String str;
        if (view == null) {
            int itemViewType = getItemViewType(i);
            int i2 = R.layout.f8nameremoved;
            if (itemViewType == 0) {
                i2 = R.layout.f8nameremoved;
            }
            ListChatInfoActivity listChatInfoActivity = this.A00;
            view = listChatInfoActivity.getLayoutInflater().inflate(i2, viewGroup, false);
            r0 = new AnonymousClass5J3();
            r0.A02 = AnonymousClass5YB.A00(view, listChatInfoActivity.A0B, R.id.name);
            r0.A01 = C86644Kx.A0M(view, R.id.status);
            r0.A00 = AnonymousClass0x9.A0F(view, R.id.avatar);
            view.setTag(r0);
        } else {
            r0 = (AnonymousClass5J3) view.getTag();
        }
        Object item = getItem(i);
        C626936e.A06(item);
        AnonymousClass3ZH r3 = (AnonymousClass3ZH) item;
        r0.A03 = r3;
        r0.A02.A08(r3);
        ImageView imageView = r0.A00;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(new AnonymousClass5MG(getContext()).A03(R.string.f11nameremoved));
        AnonymousClass0YZ.A0F(imageView, AnonymousClass000.A0X(C627336j.A07(r3.A0H), A0o));
        ListChatInfoActivity listChatInfoActivity2 = this.A00;
        listChatInfoActivity2.A0K.A08(r0.A00, r3);
        AnonymousClass547.A00(r0.A00, r0, this, r3, 5);
        if (listChatInfoActivity2.A0I.A0e(r3, -1)) {
            r0.A01.setVisibility(0);
            textEmojiLabel = r0.A01;
            str = AnonymousClass5ZU.A03(listChatInfoActivity2.A0I, r3);
        } else {
            String str2 = r3.A0X;
            TextEmojiLabel textEmojiLabel2 = r0.A01;
            if (str2 != null) {
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel = r0.A01;
                str = r3.A0X;
            } else {
                textEmojiLabel2.setVisibility(8);
                return view;
            }
        }
        textEmojiLabel.A0K((List) null, str);
        return view;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4OP(Context context, ListChatInfoActivity listChatInfoActivity, List list) {
        super(context, 0, list);
        this.A00 = listChatInfoActivity;
    }

    public int getCount() {
        return this.A00.A0j.size();
    }

    public int getViewTypeCount() {
        return 2;
    }

    public int getItemViewType(int i) {
        Object item = getItem(i);
        AnonymousClass5ZU r1 = this.A00.A0I;
        C626936e.A06(item);
        return r1.A0e((AnonymousClass3ZH) item, -1) ? 1 : 0;
    }
}
