package X;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import java.util.List;

/* renamed from: X.43Y  reason: invalid class name */
public final class AnonymousClass43Y extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ Bundle $savedInstanceState;
    public final /* synthetic */ BlockReasonListFragment this$0;

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C162457s7.A0J(list, 0);
        BlockReasonListFragment blockReasonListFragment = this.this$0;
        AnonymousClass5Y0 r6 = blockReasonListFragment.A08;
        if (r6 != null) {
            C620633i r3 = blockReasonListFragment.A06;
            if (r3 != null) {
                C620733j r4 = blockReasonListFragment.A01;
                C162457s7.A0D(r4);
                BlockReasonListFragment blockReasonListFragment2 = this.this$0;
                C60152y5 r7 = blockReasonListFragment2.A0A;
                if (r7 != null) {
                    AnonymousClass487 r5 = blockReasonListFragment2.A07;
                    if (r5 != null) {
                        blockReasonListFragment.A03 = new AnonymousClass120(r3, r4, r5, r6, r7, list, new AnonymousClass41D(blockReasonListFragment2));
                        BlockReasonListFragment blockReasonListFragment3 = this.this$0;
                        Bundle bundle = this.$savedInstanceState;
                        if (bundle != null) {
                            int i = bundle.getInt("selectedItem");
                            String string = bundle.getString("text", "");
                            C162457s7.A0D(string);
                            AnonymousClass120 r2 = blockReasonListFragment3.A03;
                            if (r2 == null) {
                                throw C18270x1.A0S("adapter");
                            }
                            r2.A00 = i;
                            r2.A01 = string;
                            Object A06 = C73723fy.A06(r2.A07, i);
                            if (A06 != null) {
                                r2.A08.invoke(A06);
                            }
                            r2.A05();
                        }
                        BlockReasonListFragment blockReasonListFragment4 = this.this$0;
                        RecyclerView recyclerView = blockReasonListFragment4.A01;
                        if (recyclerView == null) {
                            throw C18270x1.A0S("recyclerView");
                        }
                        AnonymousClass120 r0 = blockReasonListFragment4.A03;
                        if (r0 == null) {
                            throw C18270x1.A0S("adapter");
                        }
                        recyclerView.setAdapter(r0);
                        return C59022wD.A00;
                    }
                    throw C18270x1.A0S("emojiRichFormatterStaticCaller");
                }
                throw C18270x1.A0S("sharedPreferencesFactory");
            }
            throw C18270x1.A0S("systemServices");
        }
        throw C18270x1.A0S("emojiLoader");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass43Y(Bundle bundle, BlockReasonListFragment blockReasonListFragment) {
        super(1);
        this.this$0 = blockReasonListFragment;
        this.$savedInstanceState = bundle;
    }
}
