package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

public interface IntegrityManager {
    Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest);
}
