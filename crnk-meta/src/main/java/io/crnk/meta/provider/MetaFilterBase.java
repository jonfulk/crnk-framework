package io.crnk.meta.provider;

import io.crnk.core.engine.query.QueryContext;
import io.crnk.meta.model.MetaElement;

public class MetaFilterBase implements MetaFilter {


	@Override
	public void onInitializing(MetaElement element) {
		// nothing to do
	}

	@Override
	public void onInitialized(MetaElement element) {
		// nothing to do
	}

	@Override
	public MetaElement adjustForRequest(MetaElement element, QueryContext queryContext) {
		return element;
	}

}
