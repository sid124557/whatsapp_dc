package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import com.whatsapp.extensions.bloks.view.ExtensionsBottomsheetBaseContainer;
import com.whatsapp.extensions.bloks.viewmodel.WaFlowsViewModel;
import com.whatsapp.extensions.webview.view.FlowsWebBottomSheetContainer;
import com.whatsapp.wabloks.ui.FcsBottomSheetBaseContainer;

/* renamed from: X.4JL  reason: invalid class name */
public class AnonymousClass4JL implements DialogInterface.OnKeyListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4JL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        switch (this.A01) {
            case 0:
                Activity activity = (Activity) this.A00;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                activity.finish();
                return true;
            case 1:
                ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer = (ExtensionsBottomsheetBaseContainer) this.A00;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                extensionsBottomsheetBaseContainer.A1Y();
                return true;
            case 2:
                FlowsWebBottomSheetContainer flowsWebBottomSheetContainer = (FlowsWebBottomSheetContainer) this.A00;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                RelativeLayout relativeLayout = flowsWebBottomSheetContainer.A01;
                if (relativeLayout == null || relativeLayout.getVisibility() != 0) {
                    WaFlowsViewModel waFlowsViewModel = flowsWebBottomSheetContainer.A0C;
                    if (waFlowsViewModel == null) {
                        throw C18270x1.A0S("waFlowsViewModel");
                    }
                    AnonymousClass0x7.A18(waFlowsViewModel.A00);
                    return true;
                }
                C18310x6.A1A(flowsWebBottomSheetContainer);
                return true;
            case 3:
                C08310eF r2 = (C08310eF) this.A00;
                if (i != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                C18310x6.A1A(r2);
                return true;
            default:
                FcsBottomSheetBaseContainer fcsBottomSheetBaseContainer = (FcsBottomSheetBaseContainer) this.A00;
                if (i != 4 || keyEvent.getAction() != 0) {
                    return false;
                }
                fcsBottomSheetBaseContainer.A1X();
                return true;
        }
    }
}
